package com.Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScreenshot {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","G:\\Recent 3\\Recent final All videos\\BITM\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		String BaseUrl = "https://google.com";
		driver.get( BaseUrl);
		
		
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		
		//Take Screenshot
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			
		FileUtils.copyFile(srcFile,new File("G:\\Recent 3\\Recent final All videos\\BITM\\Screenshot\\PageScreenshot.png"),true);
		
		}
		catch(IOException e)
		{
			System.out.println("Error"+e);
			e.printStackTrace();
		}
		
		driver.close();
	}
	
	

}
