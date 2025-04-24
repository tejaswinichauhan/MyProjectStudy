package com.AmericanAirline_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class utility {
	
	
	public static void screenshot(WebDriver driver,String ss ) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\chauh\\OneDrive\\Pictures\\"
				+ "Screenshots\\"+ss+".jpg");
		FileHandler.copy(src, des);
	}
	
	public static String readDataFromPropertyFile(String key) throws IOException
	{
		Properties p=new Properties();
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\Test_Data\\Americanairline.properties");
	    p.load(file);
	    String value=p.getProperty(key);
	    Reporter.log("Reading"+key+"from properties file",true);
	    return value;
	
	}

}
