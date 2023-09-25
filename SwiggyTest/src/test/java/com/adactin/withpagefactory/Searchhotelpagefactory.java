package com.adactin.withpagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.commonutil.Baseutil;

public class Searchhotelpagefactory extends Baseutil {

	public Searchhotelpagefactory() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "location")
	public WebElement location;
	
	@FindBy (id = "hotels")
	public WebElement hotels;
	
	@FindBy (id = "datepick_in")
	public WebElement checkin;
	
	@FindBy (id = "datepick_out")
	public WebElement checkout;
	
	@FindBy (id = "adult_room")
	public WebElement adultroom;
	
	@FindBy (id = "child_room")
	public WebElement childroom;
	
	@FindBy (id = "Submit")
	public WebElement submit;
	
	
}

