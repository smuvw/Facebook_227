package com.Facebook.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateFBAccount {

	public static void main(String[] args) throws InterruptedException {
	
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		String t=driver.getTitle();
		System.out.println(t);
		//enter First name to SAM
		Thread.sleep(10000);
		driver.findElementById("u_0_b").sendKeys("SAM");
		Thread.sleep(9000);
		
		
		//driver.findElementByName("lastname").sendKeys("M");
		
		/*WebElement lname=driver.findElementByName("lastname");
		lname.sendKeys("MUVVA");
		lname.clear();*/
		
			driver.findElementById("u_0_w").click();

			
			
	}

}
