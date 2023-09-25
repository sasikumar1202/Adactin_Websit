package com.adactin.pagefactory;

import org.openqa.selenium.By;

import com.adactin.commonutil.Baseutil;

public class Searchhotelpagefactory extends Baseutil {

	public String locationid = "location";
	public String hotelsid = "hotels";
	public String roomtypeid = "room_type";
	public String roomnosid = "room_nos";
	public String checkindateid = "datepick_in";
	public String checkoutdateid = "datepick_out";
	public String adultroomid = "adult_room";
	public String childroomid = "child_room";
	public By Search = By.id("Submit");
	
}
