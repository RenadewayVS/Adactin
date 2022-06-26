package org.LibGlobal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	
	public WebDriver driver;
	
	//LaunchBrowser
	public WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	
	}

	//Maximize
	public void maximize() {
		driver.manage().window().maximize();
	}
	
	//LoadUrl
	public void loadUrl(String url) {
		driver.get(url);
		
	}
	
	//SendValues
	
	public void sendKeys(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);
	}
	
	//MoveToElement
	public void moveToElement(WebElement target) {
		Actions a= new Actions(driver);
		a.moveToElement(target).perform();
	}
		
	}

