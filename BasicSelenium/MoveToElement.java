package com.BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		
		WebDriver driver;
	
		System.setProperty("webdriver.chrome.driver","G:\\Recent 3\\Recent final All videos\\BITM\\Chrome\\chromedriver.exe");

		driver = new ChromeDriver();

		//String Base URL

		String BaseUrl = "http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146";
		
		driver.get( BaseUrl);
		
		WebElement mouseHover = driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/a"));
		
		
		moveElement(driver,mouseHover);
		//Click sub menu
		// driver.findElement(By.linkText("Courses")).click();
		 //driver.findElement(By.xpath("//ul[@class = 'submenu']//li//a[text()='Courses']")).click();
		 driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/ul/li[2]/a")).click();
		 
		 	

	}
	
	public static void moveElement(WebDriver driver,WebElement element)
	{
		Actions acObj = new Actions(driver);
		
		acObj.moveToElement(element).build().perform();
	}

}
