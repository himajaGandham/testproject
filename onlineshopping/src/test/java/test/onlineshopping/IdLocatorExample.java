package test.onlineshopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class IdLocatorExample {

	//public static void main(String[] args) {
	@Test		
	public void display1() {		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\naga_\\Desktop\\software download\\selenium\\firefoxwebdriver\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"C:\\Users\\naga_\\Desktop\\software download\\java\\log.txt");
		
		// creating Firefox driver object in WebDriver
		
		  WebDriver driver=new FirefoxDriver();
	
		
		driver.get("https://accounts.google.com/signin");
		
		
		WebElement ref= driver.findElement(By.id("identifierId"));
		
		
		
		
		
		ref.sendKeys("himaja.gandham@gmail.com");
		driver.close();
		

}
}
