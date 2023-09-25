package com.adactin.pagefactory;

import org.openqa.selenium.By;

import com.adactin.commonutil.Baseutil;

public class Bookhotelpagefactory extends Baseutil {

	public String firstname = "first_name";
	public String lastname = "last_name";
	public String address = "address";
	public String creditcardno = "cc_num";
	public String cardtype = "cc_type";
	public String expirymonth = "cc_exp_month";
	public String expiryyear = "cc_exp_year";
	public String cvvno = "cc_cvv";
	public By booknow = By.id("book_now");
	public String orderno = "order_no";
}
