package com.juaracoding.ujianmingguke4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.ujianmingguke4.drivers.DriversSingleton;

public class Login {
	
private WebDriver driver;
	
	public Login() {
		this.driver = DriversSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement userName;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement regPassword;
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//*[@id=\"rememberme\"]")
	private WebElement rememberMe;
	
	public void login(String regusername, String regpassword) {
		this.userName.sendKeys(regusername);
		this.regPassword.sendKeys(regpassword);
		btnLogin.click();
	}
	
	public void remember() {
		rememberMe.click();
	}

}
