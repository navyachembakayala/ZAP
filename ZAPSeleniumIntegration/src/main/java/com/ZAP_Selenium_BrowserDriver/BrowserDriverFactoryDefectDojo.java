package com.ZAP_Selenium_BrowserDriver;


import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BrowserDriverFactoryDefectDojo {
	// Make reference variable for WebDriver
	
	static WebDriver driver;
	public static WebDriver createChromeDriver(String path) {
		
	
	        // Set system property for chrome driver with the path
	       // System.setProperty("webdriver.chrome.driver", path);
			/*
			 * ChromeOptions options = new ChromeOptions();
			 * 
			 * options.addArguments("–no-sandbox");
			 * options.setExperimentalOption("useAutomationExtension", false); return new
			 * ChromeDriver(options);
			 */	
			System.setProperty("webdriver.gecko.driver", path);
			return new FirefoxDriver();}
	
	}