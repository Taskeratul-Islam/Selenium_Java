package com.BrowserOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSL {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","G:\\Recent 3\\Recent final All videos\\BITM\\Chrome\\chromedriver.exe");
		
		ChromeOptions obj = new ChromeOptions();
		
		//Accept Certificate
		
		obj.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://cacert.org");
		
		System.out.println(driver.getTitle());
		
		

	}

}
