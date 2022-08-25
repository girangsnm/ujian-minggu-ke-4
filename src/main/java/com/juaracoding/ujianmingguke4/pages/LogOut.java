package com.juaracoding.ujianmingguke4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujianmingguke4.drivers.DriversSingleton;

public class LogOut {
	
private WebDriver driver;
	
	public LogOut() {
		this.driver = DriversSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement Logout;
	
	public void logout() {
		Logout.click();
	}

}
