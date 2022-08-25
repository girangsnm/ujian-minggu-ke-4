package com.juaracoding.ujianmingguke4.main;

import org.openqa.selenium.WebDriver;

import com.juaracoding.ujianmingguke4.drivers.DriversSingleton;

public class MainApp {

	public static void main(String[] args) throws InterruptedException {

		DriversSingleton.getInstance("Chrome");
		WebDriver driver = DriversSingleton.getDriver();
		String url = "https://shop.demoqa.com/";
		driver.get(url);
	}
}
