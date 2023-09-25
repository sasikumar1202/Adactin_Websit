package com.adactin.pageexecution;

import org.openqa.selenium.WebElement;

import com.adactin.commonutil.Baseutil;
import com.adactin.pagefactory.Bookhotelpagefactory;

public class Bookhotelpageexecution extends Selecthotelpageexecution {

	Bookhotelpagefactory bh = new Bookhotelpagefactory();
	
	public void getfirstname() {
		Baseutil.type(elementFinderByID("first_name"), "Sasikumar");
	}
	
	public void getlastname() {
		Baseutil.type(elementFinderByID("last_name"), "Vadivelu");
	}
	
	public void getaddress() {
		Baseutil.type(elementFinderByID("address"), "123, C Block TCK Colony, Teynampet, Chennai - 18");
		
	}
    
	public void getcreditcardno() {
		Baseutil.type(elementFinderByID("cc_num"), "1234 3456 7642 1234");
	}
	
	public void getcardtype() {
		Baseutil.type(elementFinderByID("cc_type"), "Amex");
	}
	
	public void getexpirymonth() {
		Baseutil.type(elementFinderByID("cc_exp_month"), "March");
	}
	
	public void getexpiryyear() {
		Baseutil.type(elementFinderByID("cc_exp_year"), "2024");
	}
	
	public void getcvvno() {
		Baseutil.type(elementFinderByID("cc_cvv"), "345");
	}
	
	public void clickbooknow() {
		Baseutil.clickbutton("book_now");
	}
	
	public void printorderno() {
		String  orderno = Baseutil.elementFinderByID("order_no").getAttribute("Value");
		System.out.println(orderno);
	}
	
	
	
	
	
}
