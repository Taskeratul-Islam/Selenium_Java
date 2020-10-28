package com.ExtentReportsDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LoginTestReport {

	
	//ExtentReport
	ExtentHtmlReporter HtmlReporter;
	ExtentReports report;
	ExtentTest logger;

	WebDriver driver;
	String  ChromeDriverPath = ".\\src\\test\\resources\\Drivers\\chromedriver.exe";


	@Test
	public void login() throws IOException {
		
		
		HtmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\ExtentReport\\MyLoginTestReport.html\\") ;
			
		report = new ExtentReports();
		report.attachReporter(HtmlReporter);
		
		logger = report.createTest("Login Test");
		
		FileInputStream fis = new  FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\propertiesFile\\OR.properties");
		Properties prop = new Properties();
		prop.load(fis);

		System.setProperty("webdriver.chrome.driver",ChromeDriverPath);
		driver = new ChromeDriver();
		logger.log(Status.INFO,"Chrome Started");

		driver.get(prop.getProperty("testSiteUrl"));
		
		logger.log(Status.INFO,"Login page open");

		//Login
		//Email
		WebElement Email = driver.findElement(By.id("input-email"));
	

		//password
		WebElement Password = driver.findElement(By.id("input-password"));
	

		//Login Button
		WebElement LoginBtn = driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));

		//Action
		Email.clear();
		Email.sendKeys(prop.getProperty("TestEmail"));
		logger.log(Status.INFO,"Email input done");

		Password.clear();
		Password.sendKeys(prop.getProperty("TestPassword"));
		logger.log(Status.INFO,"Password input done");
		LoginBtn.click();
		
		logger.log(Status.PASS, "Successfully Test case Executed");
		
		report.flush();

	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}
