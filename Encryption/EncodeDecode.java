package com.Encryption;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EncodeDecode {
	
		public static String getEncodePassword()
		{
		
		String password = "123456";
		return new String(Base64.getEncoder().encode(password.getBytes()));
		
		}
		public static String getDecodepassword()
		{
			
			return new String(Base64.getDecoder().decode(getEncodePassword().getBytes()));
		}

}
