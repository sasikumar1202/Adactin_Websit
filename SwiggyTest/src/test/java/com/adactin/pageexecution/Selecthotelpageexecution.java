package com.adactin.pageexecution;

import com.adactin.commonutil.Baseutil;
import com.adactin.pagefactory.Selecthotelpagefactory;

public class Selecthotelpageexecution extends Searchhotelpageexecution {

	Selecthotelpagefactory sh = new Selecthotelpagefactory();
	
	public void getselecthotel() {
		
		Baseutil.clickbutton("radiobutton_0");
	}

	public void clickcontinue() {
		Baseutil.clickbutton("continue");
	}
}
