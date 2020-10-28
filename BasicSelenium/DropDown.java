package com.BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
	
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver","G:\\Recent 3\\Recent final All videos\\BITM\\Chrome\\chromedriver.exe");

		driver = new ChromeDriver();

		//String Base URL

		String BaseUrl = "https://the-internet.herokuapp.com/dropdown";
		
		
		driver.get( BaseUrl);
		
		WebElement ddElement = driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));

		//Create object for select
		Select dropdown = new Select(ddElement) ;
		
		//dropdown.selectByVisibleText("Option 2");
		
		//dropdown.selectByValue("1");
		
		  dropdown.selectByIndex(1);
	}

}
