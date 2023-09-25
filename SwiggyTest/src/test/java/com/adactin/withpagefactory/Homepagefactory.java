package com.adactin.withpagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.commonutil.Baseutil;

public class Homepagefactory extends Baseutil {

	public Homepagefactory() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	public WebElement username;
	
	@FindBy (id = "password")
	public WebElement password;
	
	@FindBy (id = "login")
	public WebElement login;
	
	

}
