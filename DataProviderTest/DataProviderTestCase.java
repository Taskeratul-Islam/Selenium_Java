package com.DataProviderTest;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderTestCase {

	WebDriver driver;

	@DataProvider(name = "SearchData")
	public Object [][]data()
	{
		Object [][] data = new Object[2][1] ;
		data[0][0] = "https://google.com";
		data[1][0] = "https://facebook.com";
		return data;

	}

	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver","G:\\Recent 3\\Recent final All videos\\BITM\\Chrome\\chromedriver.exe");

	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		driver = new ChromeDriver();
		Thread.sleep(5000);
	}


	@Test(dataProvider = "SearchData")
	public void searchTest(String site) throws InterruptedException
	{
		driver.get(site);
		Thread.sleep(5000);
	}

	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}

}
