package com.juaracoding.ujianmingguke4.drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.juaracoding.ujianmingguke4.drivers.strategis.DriverStrategy;
import com.juaracoding.ujianmingguke4.drivers.strategis.DriverStrategyImplementer;

public class DriversSingleton {

	private static DriversSingleton instance = null;
	private static WebDriver driver;

	private DriversSingleton(String driver) {
		instantiate(driver);

	}

	public WebDriver instantiate(String strategy) {
		DriverStrategy driverStrategy = DriverStrategyImplementer.chooseStrategy(strategy);
		driver = driverStrategy.setStrategy();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		return driver;
	}

	public static DriversSingleton getInstance(String driver) {
		if (instance == null) {
			instance = new DriversSingleton(driver);
		}

		return instance;
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
