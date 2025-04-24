package com.AmetricanAirline_Listener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.AmericanAirline_Base.Base;
import com.AmericanAirline_Utility.utility;

public class Listener extends Base implements ITestListener{
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Test case "+result.getName()+" passed",true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Test case "+result.getName()+" failed",true);
		try {
			utility.screenshot(driver, result.getName()+"_failed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
