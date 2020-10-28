package com.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleValidation {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","G:\\Recent 3\\Recent final All videos\\BITM\\Chrome\\chromedriver.exe");

		driver = new ChromeDriver();
		
		//String Base URL
		
		String BaseUrl = "https://demo.opencart.com/index.php?route=account/login";
		
		driver.get( BaseUrl);
		
		String ExpectedTitle ="Account Login";
		
		String ActualTitle = driver.getTitle();
		
		String ActualURL = driver.getCurrentUrl() ;
		
		System.out.println(ActualTitle);
		
		if(ActualTitle.equalsIgnoreCase(ExpectedTitle))
		{
			
			System.out.println("Title Match.Test Passed.");
		}
		else
		{
			
			System.out.println("Title not Match.Test failed.");
		}
		
		driver.close();

	}

}
