package com.adactin.withpageexecution;

import java.util.concurrent.TimeUnit;

public class Execution extends Bookhotelpageexecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Execution e = new Execution();
		e.browseropen("chrome");
		e.openurl("https://adactinhotelapp.com/");
		e.enterusername();
		e.enterpassword();
		e.clicksubmit();
		e.enterlocation();
		e.enterhotel();
		e.entercheckin();
		e.entercheckout();
		e.enteradultroom();
		e.enterchildroom();
		e.clicksearch();
		e.enterradioutton();
		e.clickcontinue();
		e.enterfirstname();
		e.enterlastname();
		e.enteraddress();
		e.entercreditcardno();
		e.entercardtype();
		e.enterexpirymonth();
		e.enterexpiryyear();
		e.entercvvno();
		e.clickbooknow();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		e.printorderno();
	}

}
