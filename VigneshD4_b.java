package org.project4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VigneshD4_b {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\my-pc\\eclipse-workspace\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.guru99.com/");
	}

}
