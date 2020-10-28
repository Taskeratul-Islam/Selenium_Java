package com.BrowserOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","G:\\Recent 3\\Recent final All videos\\BITM\\Chrome\\chromedriver.exe");

		ChromeOptions obj = new ChromeOptions();

		obj.setHeadless(true);

		/*
		 * *************************************
		 * *************************************
		 */

		WebDriver driver = new ChromeDriver(obj);

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
