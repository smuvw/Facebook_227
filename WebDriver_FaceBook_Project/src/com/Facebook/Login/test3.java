package com.Facebook.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test3 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		/*driver.get("https://jqueryui.com/slider/");
		
		WebElement e=driver.findElementByXPath(".//*[@id='content']/iframe");
		
		driver.switchTo().frame(e);
		
		WebElement s=driver.findElementByXPath(".//*[@id='slider']/span");
		
		Actions action= new Actions(driver);
		
		action.dragAndDropBy(s, 350, 0).perform();*/
		
		
		/*driver.get("https://jqueryui.com/resizable/");
		
		WebElement e=driver.findElementByXPath(".//*[@id='content']/iframe");
		
		driver.switchTo().frame(e);
		
		Thread.sleep(5000);
		
		WebElement s=driver.findElementByXPath(".//*[@id='resizable']/div[3]");
		Thread.sleep(5000);
		
		Actions action= new Actions(driver);
		
		action.dragAndDropBy(s, 600, 400).perform();*/
		
		
		driver.get("https://www.macys.com/");
		WebElement s=driver.findElementByXPath(".//*[@id='flexid_5991']/a/span");
		
		Actions action= new Actions(driver);
		
		action.moveToElement(s).perform();
		
		Thread.sleep(10000);
		
		driver.findElementByXPath(".//*[@id='mainNavigationFlyouts']/div[8]/div[2]/ul[2]/li[4]/a").click();
	}

}
