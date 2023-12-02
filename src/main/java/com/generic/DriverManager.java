package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
public WebDriver getChromeDriver(WebDriver driver) {
		
		//Open the browser in Chrome
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		return driver;
	}

public WebDriver getFirefoxDriver(WebDriver driver) {
	
	//Open the browser in Firefox
	WebDriverManager.firefoxdriver().setup();
	
	driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	return driver;
}


}
