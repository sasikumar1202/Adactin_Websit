package com.adactin.withpagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.commonutil.Baseutil;

public class Bookhotelpagefactory extends Baseutil {

	public Bookhotelpagefactory() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "first_name")
	public WebElement firstname;
	
	@FindBy (id = "last_name")
	public WebElement lastname;

	@FindBy (id = "address")
	public WebElement address;
	
	@FindBy (id = "cc_num")
	public WebElement creditcardno;
	
	@FindBy (id = "cc_type")
	public WebElement cardtype;
	
	@FindBy (id = "cc_exp_month")
	public WebElement expirymonth;
	
	@FindBy (id = "cc_exp_year")
	public WebElement expiryyear;
	
	@FindBy (id = "cc_cvv")
	public WebElement cardcvvno;
	
	@FindBy (id = "book_now")
	public WebElement booknow;
	
	@FindBy (id = "order_no")
	public WebElement orderno;

	
	
	
	
}
