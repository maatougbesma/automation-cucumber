package com.e2e.Test.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Setup {
	
	private static WebDriver driver;
	
	public void setWebDriver() {
		String browser = System.getProperty("browser");
		if(browser == null) {
			browser = "chrome";
					}
	switch (browser) {
	case "chrome" :
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/windows/chromedriver.exe");
	ChromeOptions chromeOptions = new ChromeOptions();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	
	}
		
	}
		
	

}
