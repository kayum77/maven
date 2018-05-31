package com.bit.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTest {

	
	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kayum\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		
		 ChromeDriver browser = new ChromeDriver();
		browser.get("http://www.target.com/");
		
		
		
		
		
		
		Thread.sleep(5000);
		browser.quit();
	}
	
	
}
