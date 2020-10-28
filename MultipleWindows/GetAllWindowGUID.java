package com.MultipleWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllWindowGUID {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","G:\\Recent 3\\Recent final All videos\\BITM\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		String BaseUrl = "https://the-internet.herokuapp.com/windows";
		driver.get( BaseUrl);
		
		
		String parentGUID = driver.getWindowHandle();
		
		System.out.println("Parent Window GUID: " +parentGUID);
		
		WebElement NewWinBtn = driver.findElement(By.cssSelector("#content > div > a")) ;
		NewWinBtn.click();
		
		//Get all session if of browser
		
		Set<String> allGUID = driver.getWindowHandles();
		System.out.println(allGUID);
		

	}

}
