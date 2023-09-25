package com.adactin.pageexecution;

import com.adactin.commonutil.Baseutil;
import com.adactin.pagefactory.Searchhotelpagefactory;

public class Searchhotelpageexecution extends Homepageexecution {

	Searchhotelpagefactory sh = new Searchhotelpagefactory();
	
	public void getlocation() {
		Baseutil.type(elementFinderByID(sh.locationid),"Sydney");
				
	}
	
	public void gethotelname() {
		
		Baseutil.type(elementFinderByID(sh.hotelsid),"Hotel Creek");
	}
	
	public void getroomtype() {
		Baseutil.type(elementFinderByID(sh.roomtypeid),"Standard");
	}
	
	public void getroomnos() {
		Baseutil.type(elementFinderByID(sh.roomnosid),"1");
		
	}
	
	public void getcheckindate() {
		Baseutil.elementFinderByID(sh.checkindateid).clear();
		Baseutil.type(elementFinderByID(sh.checkindateid),"15/09/2022");
	}
	
	public void getcheckoutdate() {
		Baseutil.elementFinderByID(sh.checkoutdateid).clear();
		Baseutil.type(elementFinderByID(sh.checkoutdateid),"20/09/2022");

	}
	
	public void getadultroom() {
	    Baseutil.type(elementFinderByID(sh.adultroomid),"2");

	}
	
	public void getchildroom() {
		Baseutil.type(elementFinderByID(sh.childroomid),"1");
	}
	
	public void clicksearch() {
		Baseutil.clickbutton("Submit");
	}
	
	
	
	
	
	
	
	
	
	
}
