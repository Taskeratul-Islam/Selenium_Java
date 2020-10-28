package com.propertiesTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginPropertiesTest {

	WebDriver driver;
	String  ChromeDriverPath = ".\\src\\test\\resources\\Drivers\\chromedriver.exe";


	@Test
	public void login() throws IOException {

		FileInputStream fis = new  FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\propertiesFile\\OR.properties");
		Properties prop = new Properties();
		prop.load(fis);

		System.setProperty("webdriver.chrome.driver",ChromeDriverPath);
		driver = new ChromeDriver();

		driver.get(prop.getProperty("testSiteUrl"));

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
		Password.clear();
		Password.sendKeys(prop.getProperty("TestPassword"));
		LoginBtn.click();

	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}
