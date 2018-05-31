package com.bit.selenium;


public class SeleniumHWSmokeTest {
	
	

	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kayum\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	
	SeleniumHW1 swh = new SeleniumHW1();
	swh.amazonBugTest();
	
	Thread.sleep(3000);
	
}

	
	

}
