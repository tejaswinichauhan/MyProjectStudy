package com.AmericanAirline_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class paymentPage {
	
	@FindBy(xpath="//span[@class='fop-name AFOP-name']")private WebElement mode;
	@FindBy(id = "afop-options")private WebElement options;
	@FindBy(xpath="//label[@for='w15_widget-input-purchaseForm-termsConditionsForm-termsAndCondition']")private WebElement termsandcon;
	@FindBy(xpath="//span[text()='Pay now']")private WebElement button;
	
	public paymentPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void modeofpayment()
	{
		mode.click();
	}
	
	public void selectmethod()
	{
		Select a=new Select(options);
		a.selectByContainsVisibleText("UPI");
	}
	
	public void checkbox()
	{
		termsandcon.click();
	}
	public void paynowButton()
	{
		button.click();
	}

}
