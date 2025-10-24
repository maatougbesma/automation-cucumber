package com.e2e.Test.automation.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class TearDown {
	
	/**
	 * This method is used to close browser.
	 * This method is called after the invocation of each test method in given class.
	 * @After Methods annotated with @After execute after every scenario.
	 */
	@After
	public void quitDriver(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte [] Screenshot = ((TakesScreenshot) Setup.getDriver()).getScreenshotAs(OutputType.BYTES); //quand scenario is failed va faire une capture d'ecran
			scenario.attach(Screenshot, "image/png", "screenshot");//rattachement de l'image dans le rapport
		}
		Setup.getDriver().quit();

	}

}
