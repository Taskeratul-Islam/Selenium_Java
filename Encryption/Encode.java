package com.Encryption;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Encode {
	
	static String decodepassword="MTIzNDU2";
	
	
	public static String getDecodepassword()
	{
		
		return new String(Base64.getDecoder().decode(decodepassword.getBytes()));
	}

	public static void main(String[] args) {
		
		/*
		 * 
		 * Password Encryption
		 * 
		 */
		
		String password = "123456";
		byte[] encodePassword = Base64.getEncoder().encode(password.getBytes());
		
		/*
		 * --------------------------------------------
		 * --------------------------------------------
		 */
		
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver","G:\\Recent 3\\Recent final All videos\\BITM\\Chrome\\chromedriver.exe");

		driver = new ChromeDriver();

		//String Base URL

		String BaseUrl = "https://demo.opencart.com/index.php?route=account/login";
		String TestEmail = "mail22@mail.com";

		
		driver.get( BaseUrl);
		
		//Email
		WebElement Email = driver.findElement(By.id("input-email"));
		
		//password
		WebElement Password = driver.findElement(By.id("input-password"));
		
		//Login Button
		WebElement LoginBtn = driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));

		//Action
		Email.clear();
		Email.sendKeys(TestEmail);
		
		Password.clear();
		Password.sendKeys(getDecodepassword());
		
		LoginBtn.click();

	}

}

