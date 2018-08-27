package com.naukri.scenario1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static WebDriver driver=null;
	
	public static void main(String[] args) throws Exception
	{
	System.setProperty("webdriver.chrome.driver","C:\\SeleniumAutomation\\Drivers\\chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.navigate().to("https://www.naukri.com/");
	

	String mainwindow=driver.getWindowHandle();
	System.out.println("main window-->" +mainwindow);
	
	Set<String> allwindowhandle=driver.getWindowHandles();
	
	         
	/*for(String handle:allwindowhandle)
	
		
		if(handle.equals(mainwindow))
			continue;
		
		else 
		{
			String  URL=driver.switchTo().window(handle).getCurrentUrl();
		System.out.println("Switching to window - > " + URL);
		driver.close();
		}*/
				
	}
}