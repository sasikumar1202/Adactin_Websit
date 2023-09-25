package com.adactin.withpageexecution;

import com.adactin.commonutil.Baseutil;
import com.adactin.withpagefactory.Homepagefactory;

public class Homepageexecution extends Baseutil  {
 
	public void enterusername() {
		Homepagefactory hp = new Homepagefactory();
		Baseutil.type(hp.username, "sasiselenium");
	}
	
	public void enterpassword() {
		Homepagefactory hp = new Homepagefactory();
		Baseutil.type(hp.password, "baargav30@K");
	}
	
	public void clicksubmit() {
		Homepagefactory hp = new Homepagefactory();
		Baseutil.clickbutton("login");
	}
}
