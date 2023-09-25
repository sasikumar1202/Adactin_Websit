package com.adactin.withpagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.commonutil.Baseutil;

public class Selecthotelpagefactory extends Baseutil {

	public Selecthotelpagefactory() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "radiobutton_1")
	public WebElement radiobutton;
	
	@FindBy (id = "continue")
	public WebElement continueclick;
}
