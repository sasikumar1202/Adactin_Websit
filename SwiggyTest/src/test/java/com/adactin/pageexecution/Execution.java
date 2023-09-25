package com.adactin.pageexecution;

import java.util.concurrent.TimeUnit;

public class Execution extends Bookhotelpageexecution {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Execution e = new Execution();
		browseropen("chrome");
		openurl("https://adactinhotelapp.com/");
		e.getuserid();
		e.getpassword();
		e.clickbutton();
		e.getlocation();
		e.gethotelname();
		e.getroomtype();
		e.getroomnos();
		e.getcheckindate();
		e.getcheckoutdate();
		e.getadultroom();
		e.getchildroom();
		e.clicksearch();
		e.getselecthotel();
		e.clickcontinue();
		e.getfirstname();
		e.getlastname();
		e.getaddress();
		e.getcreditcardno();
		e.getcardtype();
		e.getexpirymonth();
		e.getexpiryyear();
		e.getcvvno();
		e.clickbooknow();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		e.printorderno();
		
		
		
		
		
		
		
		
		
		
	}

}
