package com.BrowserOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuth {

	public static void main(String[] args) {


		WebDriver driver;

		System.setProperty("webdriver.chrome.driver","G:\\Recent 3\\Recent final All videos\\BITM\\Chrome\\chromedriver.exe");

		driver = new ChromeDriver();

		//String Base URL

		String BaseUrl = "http://admin:admin@the-internet.herokuapp.com/basic_auth";

		driver.get( BaseUrl);


	}

}
