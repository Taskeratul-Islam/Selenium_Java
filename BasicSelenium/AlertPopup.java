package com.BasicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertPopup {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver","G:\\Recent 3\\Recent final All videos\\BITM\\Chrome\\chromedriver.exe");

		driver = new ChromeDriver();

		//String Base URL

		String BaseUrl = "https://the-internet.herokuapp.com/javascript_alerts";
		
		
		driver.get( BaseUrl);
		
		//WebElement JSAlert = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
		
		//JSAlert.click();
		
		
		
        // WebElement ConfirmAlert = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
		
		// ConfirmAlert.click();
		

         WebElement PromptAlert = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
		
		 PromptAlert.click();
		
		//AlertPopup.acceptAlertPopup();
		// AlertPopup.cancelAlertPopup();
		 AlertPopup.typeIn();

	}
	
	public static void acceptAlertPopup()
	{
		
		try {
			
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			
			Thread.sleep(4000);
			alert.accept();
			System.out.println("Alert Accepted!!!!!");
			
		    }
		
		catch(Exception e)
			{
			
			System.out.println("Something went wrong"+e.getMessage());
			
		    }
		
	}
	
	public static void cancelAlertPopup()
	{
		
		try {
			
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			
			Thread.sleep(4000);
			alert.dismiss();
			System.out.println("Alert Cancelled!!!!!");
			
		    }
		
		catch(Exception e)
			{
			
			System.out.println("Something went wrong"+e.getMessage());
			
		    }
		
	}
	
	public static void typeIn()
	{
		try {
			
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			
			Thread.sleep(4000);
			String inputText = "Dhaka";
			driver.switchTo().alert().sendKeys(inputText);
			alert.accept();
			
		    }
		
		catch(Exception e)
			{
			
			System.out.println("Something went wrong"+e.getMessage());
			
		    }
		
		
		
	}
	

}
