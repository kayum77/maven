package com.bit.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHW1 {
	
		
	
	// Try to sign in on amazon.com
	// 1. click on Account sign in tab
	//2.click on sign in button.
    //3. put the text on email edit box.
		 
	
	
	 ChromeDriver browser = new ChromeDriver();

				
	 void amazonBugTest() {
	 
	 browser.get("http://www.amazon.com");
	 browser.findElement(By.xpath("//input[@type='text']")).click();
	 
	
	 
	 browser.findElement(By.xpath("//span[text()='Sign in']")).click();
	 
	 browser.findElement(By.xpath("//input[@type='email']")).sendKeys("clickkayum@gmail.com");
	 
	 
	 
	 
	 
	 
	 browser.quit();
	 
	 
	 
	 
	 
	 
	 
	 
                          }
		
		
	
		
		
		
		
		
	
	}
