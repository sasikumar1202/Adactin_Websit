package com.adactin.withpageexecution;

import com.adactin.commonutil.Baseutil;
import com.adactin.withpagefactory.Bookhotelpagefactory;

public class Bookhotelpageexecution extends Selecthotelpageexecution {

	public void enterfirstname() {
		Bookhotelpagefactory bh = new Bookhotelpagefactory();
		Baseutil.type(bh.firstname, "Sasikumar");
	}
	
	public void enterlastname() {
		Bookhotelpagefactory bh = new Bookhotelpagefactory();
		Baseutil.type(bh.lastname, "Vadivelu");
				}
	
	public void enteraddress() {
		Bookhotelpagefactory bh = new Bookhotelpagefactory();
		Baseutil.type(bh.address, "110, C Block, TVK Colony, Teynampet, Chennai - 18");
	}
    
	public void entercreditcardno() {
		Bookhotelpagefactory bh = new Bookhotelpagefactory();
		Baseutil.type(bh.creditcardno, "9876 1230 7641 5670");
	}
	
	public void entercardtype() {
		Bookhotelpagefactory bh = new Bookhotelpagefactory();
		Baseutil.type(bh.cardtype, "MAST");
	}
	
	public void enterexpirymonth() {
		Bookhotelpagefactory bh = new Bookhotelpagefactory();
		Baseutil.type(bh.expirymonth, "May");
	}
	
	public void enterexpiryyear() {
		Bookhotelpagefactory bh = new Bookhotelpagefactory();
		Baseutil.type(bh.expiryyear, "2022");
	}
	
	public void entercvvno() {
		Bookhotelpagefactory bh = new Bookhotelpagefactory();
		Baseutil.type(bh.cardcvvno, "879");
	}
	
	public void clickbooknow() {
		Bookhotelpagefactory bh = new Bookhotelpagefactory();
		Baseutil.clickbutton("book_now");
	}
	
	public void printorderno() {
		Bookhotelpagefactory bh = new Bookhotelpagefactory();
		String  orderno = Baseutil.elementFinderByID("order_no").getAttribute("Value");
		System.out.println(orderno);
	}
	
	
}
