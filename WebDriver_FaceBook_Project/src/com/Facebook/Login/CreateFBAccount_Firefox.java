package com.Facebook.Login;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateFBAccount_Firefox {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
				
		driver.get("https://www.facebook.com/");
		
	  WebElement d=driver.findElementById("month");
	
	   
	   //Select class
		
	   Select s= new Select(d);
	   
	   
	   
	   //s.selectByIndex(4);
	  // s.selectByValue("2");
	   //s.selectByVisibleText("May");
	   
	   List<WebElement >options = s.getOptions();
	   
	   System.out.println(options.size());
	   
	   for(int i=0;i<options.size();i++){
		   
		   String v=options.get(i).getText();
		   System.out.println(v);
	   }
		


	}

}
