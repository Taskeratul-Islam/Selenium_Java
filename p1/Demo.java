package com.p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		
		System.setProperty("webdriver.chrome.driver","G:\\Recent 3\\Recent final All videos\\BITM\\Chrome\\chromedriver.exe");

		driver = new ChromeDriver();
		
		
		
		try {
			
			//Implicit wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Explicit wait
			//WebDriverWait = new WebDriverWait(driver,10);
			//wait.untill(ExpectedConditions.visibilityOfAllElements());
			
			Thread.sleep(10000);
			
			driver.get("google.com");
			
			
		}
			
		catch(Exception e)
		{
			System.out.println("URL Wrong");
		}
		
		
		//driver.get("https://google.com");
		
	
		
		driver.close();
		//driver.quit();
		
		
	}

}
