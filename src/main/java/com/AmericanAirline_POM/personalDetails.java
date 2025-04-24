package com.AmericanAirline_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class personalDetails {
	
	@FindBy(name = "IDEN_Gender")private WebElement gender;
	@FindBy(name = "IDEN_FirstName")private WebElement name;
	@FindBy(name="IDEN_LastName")private WebElement lastname;
	@FindBy(name="DateDay")private WebElement  day;
	@FindBy(name="DateMonth")private WebElement month;
	@FindBy(name="DateYear")private WebElement year;
	@FindBy(name ="Email")private WebElement mail;
	@FindBy(name="EmailConfirm")private WebElement confirmMail;
	@FindBy(name="PhoneMobileCode")private WebElement code;
	@FindBy(name = "PhoneMobile")private WebElement number;
	@FindBy(xpath = "//span[text()='continue']")private WebElement button1;
	
	public  personalDetails(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void selectgender()
	{
		gender.click();
		Select s=new Select(gender);
		s.selectByContainsVisibleText("Female");
		Reporter.log("Selected gender",true);
	}
	
	public void firstname(String s)
	{
		name.sendKeys(s);
		Reporter.log("Entered first name",true);
	}
	
	public void lastNameInput(String s1)
	{
		lastname.sendKeys(s1);
		Reporter.log("Enter lastname",true);
	}
	
	public void selectday()
	{
		day.click();
		Select s=new Select(day);
		s.selectByContainsVisibleText("28");
		Reporter.log("Selected day",true);
		
	}
	public void selectMonth()
	{
		month.click();
       Select s1=new Select(month);
       s1.selectByContainsVisibleText("March");
       Reporter.log("Selected month",true);
	}

	public void selectYear()
	{
		year.click();
		Select s2=new Select(year);
		s2.selectByContainsVisibleText("2000");
		Reporter.log("Selected year",true);
	}
	
	public void email(String e)
	{
		mail.sendKeys(e);
		Reporter.log("Enter email",true);
	}
	
	public void confirmEmail(String ee)
	{
		confirmMail.sendKeys(ee);
		Reporter.log("Email confirmed",true);
	}
	
	public void selectCode()
	{
		code.click();
		Select cc=new Select(code);
		cc.selectByContainsVisibleText("India (+91)");
		Reporter.log("Selected code",true);
	}
	
	public void mobileNo(String m)
	{
		number.sendKeys(m);
		Reporter.log("Entered mobile number",true);
	}
	
	public void continueButton()
	{
		button1.click();
		Reporter.log("click on continue button",true);
	}
	
}
