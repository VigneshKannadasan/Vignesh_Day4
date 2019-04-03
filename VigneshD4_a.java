package org.project4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VigneshD4_a {
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\my-pc\\eclipse-workspace\\Selenium\\drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.guru99.com/");
	List<WebElement> title = driver.findElements(By.xpath("(//ul[@class='menu'])[4]"));
	for (WebElement String:title) {
	System.out.println(String.getText());
	
	}
	List<WebElement> title1 = driver.findElements(By.xpath("(//ul[@class='menu'])[10]"));
	for (WebElement String:title1) {
		System.out.println(String.getText());
	}
	driver.quit();
	
	}

}
