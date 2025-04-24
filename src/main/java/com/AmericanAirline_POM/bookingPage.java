package com.AmericanAirline_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class bookingPage {
	
	@FindBy(className = "main-label")private WebElement sorting;
	@FindBy(xpath = "//ul[@id='w23']/li[3]/a")private WebElement ulSorting;
	@FindBy(id = "table-bound0-cell00-available-content")private WebElement element;
	@FindBy(xpath="//span[text()='continue']")private WebElement  button;
	
	public bookingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sort()
	{
		sorting.click();
		Reporter.log("Sorted",true);
	}
	
	public void ulSort()
	{
		ulSorting.click();
		Reporter.log("Sorted UL ",true);
	}
	
	public void select()
	{
		element.click();
		Reporter.log("Clicked on webelement",true);
	}

	public void continuebutton()
	{
		button.click();
		Reporter.log("Clicked on continue button on booking page",true);
	}
}
