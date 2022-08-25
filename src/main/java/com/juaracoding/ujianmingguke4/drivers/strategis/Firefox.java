package com.juaracoding.ujianmingguke4.drivers.strategis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {

	public WebDriver setStrategy() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

}
