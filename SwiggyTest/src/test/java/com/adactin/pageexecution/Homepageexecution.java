package com.adactin.pageexecution;

import com.adactin.commonutil.Baseutil;
import com.adactin.pagefactory.Homepagefactory;

public class Homepageexecution extends Baseutil {

	Homepagefactory hp = new Homepagefactory();
	
	
	public void getuserid() {
		Baseutil.type(elementFinderByID(hp.usernameid),"sasiselenium");
		
	}
	
	public void getpassword() {
		Baseutil.type(elementFinderByID(hp.passid), "baargav30@K");
		
	}
	
	public void clickbutton() {
		Baseutil.clickbutton("login");		
	}
}
