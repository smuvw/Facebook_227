package com.Facebook.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		
		//welcome
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com");
		
		driver.findElementByXPath(".//*[@id='sidebar']/aside[1]/ul/li[4]/a").click();
		
		WebElement f=driver.findElementByXPath(".//*[@id='content']/iframe");
		
		driver.switchTo().frame(f);
		
		driver.findElementByXPath(".//*[@id='selectable']/li[2]").click();
		
		driver.switchTo().defaultContent();  // move focus to frame to page 
		
		driver.findElementByXPath(".//*[@id='sidebar']/aside[1]/ul/li[5]/a").click();

	}

}
