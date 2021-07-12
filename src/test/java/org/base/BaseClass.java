package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver browserLaunch() {
		System.setProperty("webdriver.chrome.driver","D:\\Users\\gnanas\\eclipse-workspace\\testng\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	
	public static void sendValue(WebElement e, String val) {
		e.sendKeys(val);
	}

}
