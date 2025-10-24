package com.e2e.Test.automation.utils;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

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
			chromeOptions.addArguments("['start-maximized']");
			break;
		case"firefox":
			System.setProperty("webdriver.gecko.driver", "src/test/resource/drivers/windows/geckodriver.exe");
			FirefoxProfile profile = new FirefoxProfile();
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setCapability("platform", Platform.WIN10);
			firefoxOptions.setProfile(profile);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
			default:
				throw new IllegalArgumentException("Browser \"" + browser + "\" is not supported. ");
			
			

		}

	}



}
