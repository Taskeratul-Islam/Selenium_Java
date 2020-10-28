package com.BasicSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize   {

	public static void main(String[] args) {
		
	//	Config obj = new Config();
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","G:\\Recent 3\\Recent final All videos\\BITM\\Chrome\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Get full window size
		
		
		
		//System.out.println("Full Window Size :"+Wsize);
		
		//Target(1000,600)
		
		driver.manage().window().setSize(new Dimension(1000,600));
		
		Dimension Wsize = driver.manage().window().getSize();
		
		//Get width
		
		int BrowserWidth = Wsize.width;
		
		System.out.println("New Width :"+BrowserWidth);
		
		//Get Height
		
		int BrowserHeight = Wsize.height;
		
		System.out.println("New Height :"+BrowserHeight);
		
		
		
		
		
		
		

	}

}
