package com.BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
	
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","G:\\Recent 3\\Recent final All videos\\BITM\\Chrome\\chromedriver.exe");

		driver = new ChromeDriver();
		
		//String Base URL
		
		String BaseUrl = "https://demo.opencart.com/";
		
		driver.get( BaseUrl);
		
		driver.navigate().to("https://www.apple.com/");
		
		String AppleTitle = driver.getTitle();
		
		System.out.println(AppleTitle);
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.google.com/");
		
		System.out.println(driver.getTitle());

	}

}
