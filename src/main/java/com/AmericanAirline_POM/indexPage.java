package com.AmericanAirline_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class indexPage {
	
	@FindBy(xpath="//span[text()='One way']")private  WebElement oneway;
	@FindBy(id="reservationFlightSearchForm.originAirport")private WebElement fromCity;
	@FindBy(xpath="//ul[@id='ui-id-1']/li[1]/a")private WebElement fromulist;
	@FindBy(xpath="//input[@name='destination']")private WebElement toCity;
    @FindBy(xpath="//ul[@id='ui-id-2']/li[1]/a")private WebElement toulist;
    @FindBy(xpath="//select[@name='adults']")private WebElement people;
    @FindBy(xpath="//select[@name='children']")private WebElement  childselect;
    @FindBy(xpath="(//button[@class='ui-datepicker-trigger'])[1]")private WebElement calender;
    @FindBy(xpath="//table[1]/tbody[1]/tr[5]/td[4]/a")private WebElement date;
	@FindBy(xpath="(//input[@type='submit'])[1]")private WebElement searchbutton;
    
    
	public indexPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);	
	}
	
	
	
	public void radiobutton() {
		 oneway.click();
		 Reporter.log("Clicked on radio button",true);
	}
	
	public void city1(String s) throws InterruptedException
	{
		fromCity.sendKeys(s);
		Thread.sleep(3000);
		fromCity.click();
		Reporter.log("Selected the city",true);
	}
	
	public void select() 
	{
		fromulist.click();
		Reporter.log("Selected the from city from UL list",true);
	}
	
	public void city2(String m) throws InterruptedException
	{
		toCity.sendKeys(m);
		Thread.sleep(3000);
		toCity.click();
		Reporter.log("Selected the city2 from UL list",true);
	}
	
	public void select1() 
	{
		toulist.click();
		Reporter.log("Selected the to city from UL list",true);
	}
	
	public void personstravel() 
	{
		Select s=new Select(people);
		s.selectByContainsVisibleText("1");
		Reporter.log("Selected the persons travel from list",true);
	}
	
	public void selectchild()
	{
		Select s1= new Select(childselect);
		s1.selectByContainsVisibleText("0");
		Reporter.log("Selected child",true);
	}
	
	public void selectcal() 
	{
	    calender.click();
	    Reporter.log("Selected calender",true);
	}
	
	public void selectdate()
	{
		date.click();
		Reporter.log("Selected date",true);
	}
	
	public void search()
	{
		searchbutton.click();
		Reporter.log("Clicked on searched",true);
	}
	
   	
	
}
