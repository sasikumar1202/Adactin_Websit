package com.adactin.commonutil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Baseutil {


	public static WebDriver driver=null;
    public static WebDriver browseropen(String browser) {
    	
    	switch (browser){
    	case "chrome":
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Seleniumtask\\chromedriver\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	break;
    	
    	case "edge":
			System.setProperty("webdriver.edge.driver", "C:\\Users\\USER\\eclipse-workspace\\Seleniumtask\\edgedriver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize(); 
			break;
    }
    	return driver;
    	}
	
	
    
	public static void openurl (String url) {
		
		driver.get(url);
	}
	
	public static WebElement elementfinder(By locator) {
		
		return driver.findElement(locator);
	}
    
	public static WebElement elementfinderbyXpath(String locator) {
	
		return driver.findElement(By.xpath(locator));
	}
	
	public static WebElement elementFinderByID(String locator) {

		return driver.findElement(By.id(locator));
	}
	
	public static void clickbutton(String buttonname) {
		
		driver.findElement(By.name(buttonname)).click();
	}
	
	public static void type(WebElement element, String data) {
		try {
			element.sendKeys(data);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
}
