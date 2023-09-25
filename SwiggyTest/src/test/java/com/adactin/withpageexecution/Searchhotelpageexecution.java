package com.adactin.withpageexecution;

import com.adactin.commonutil.Baseutil;
import com.adactin.pageexecution.Homepageexecution;
import com.adactin.withpagefactory.Searchhotelpagefactory;

public class Searchhotelpageexecution extends com.adactin.withpageexecution.Homepageexecution {

	public void enterlocation() {
		Searchhotelpagefactory sh = new Searchhotelpagefactory();
		Baseutil.type(sh.location, "London");
	}
	
	public void enterhotel() {
		Searchhotelpagefactory sh = new Searchhotelpagefactory();
		Baseutil.type(sh.hotels, "Hotel Creek");
	}
	
	public void entercheckin() {
		Searchhotelpagefactory sh = new Searchhotelpagefactory();
		Baseutil.elementFinderByID("datepick_in").clear();
		Baseutil.type(sh.checkin, "18/09/2022");
	}
	
	public void entercheckout() {
		Searchhotelpagefactory sh = new Searchhotelpagefactory();
		Baseutil.elementFinderByID("datepick_out").clear();
		Baseutil.type(sh.checkout, "26/09/2022");
	}
	
	public void enteradultroom() {
		Searchhotelpagefactory sh = new Searchhotelpagefactory();
		Baseutil.type(sh.adultroom, "2");
	}
	
	public void enterchildroom() {
		Searchhotelpagefactory sh = new Searchhotelpagefactory();
		Baseutil.type(sh.childroom, "1");
	}
	
	public void clicksearch() {
		Searchhotelpagefactory sh = new Searchhotelpagefactory();
		Baseutil.clickbutton("Submit");
	}	
	
	
	
	
}
