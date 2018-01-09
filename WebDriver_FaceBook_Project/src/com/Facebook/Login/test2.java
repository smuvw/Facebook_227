package com.Facebook.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args)  {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/spinner/");
		
		WebElement f=driver.findElementByXPath(".//*[@id='content']/iframe");
		
		driver.switchTo().frame(f);
		
		driver.findElementByXPath(".//*[@id='spinner']").sendKeys("2");
		driver.findElementByXPath(".//*[@id='getvalue']").click();
		
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		
	}

}
