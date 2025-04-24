package com.AmericanAirline_Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base {
	
	public WebDriver driver;
	public void openbrowser(String value)
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(value);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		Reporter.log("Browser is launched",true);
		
	}
	
	public  void closebrowser()
	{
		driver.quit();
		Reporter.log("Browser is closed",true);
	}

}
