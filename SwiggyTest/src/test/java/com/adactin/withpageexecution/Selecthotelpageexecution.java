package com.adactin.withpageexecution;

import com.adactin.commonutil.Baseutil;
import com.adactin.withpagefactory.Selecthotelpagefactory;

public class Selecthotelpageexecution extends Searchhotelpageexecution {

	public void enterradioutton() {
		Selecthotelpagefactory shp = new Selecthotelpagefactory();
		Baseutil.clickbutton("radiobutton_1");	
	}
	
	public void clickcontinue() {
		Selecthotelpagefactory shp = new Selecthotelpagefactory();
		Baseutil.clickbutton("continue");
	}
}
