package com.naukri.scenario1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MonsterScripts {
	
	public static WebDriver driver=null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumAutomation\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.monsterindia.com/");
		

	}

}
