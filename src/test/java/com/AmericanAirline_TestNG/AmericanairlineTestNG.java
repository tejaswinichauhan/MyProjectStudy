package com.AmericanAirline_TestNG;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.AmericanAirline_Base.Base;
import com.AmericanAirline_POM.bookingPage;
import com.AmericanAirline_POM.indexPage;
import com.AmericanAirline_POM.paymentPage;
import com.AmericanAirline_POM.personalDetails;
import com.AmericanAirline_Utility.utility;

public class AmericanairlineTestNG extends Base {
	
	Logger logger;
	indexPage i;
	bookingPage b;
	personalDetails p;
	paymentPage a;
	
  @BeforeClass
  public void launchbrowser() throws IOException
  {
	  logger = Logger.getLogger("My_New_log");
	  PropertyConfigurator.configure("log4j.properties");
	  logger.info("Hello");

	  openbrowser(utility.readDataFromPropertyFile("URL"));
	  i=new indexPage(driver);
	  b=new bookingPage(driver);
	  p=new personalDetails(driver);
	  a=new paymentPage(driver);
	  
	  
	  
  }
	
	
  @Test
  public void validate() throws InterruptedException, IOException 
  {
	  i.radiobutton();
	 
	  i.city1("New york");
	  i.select();
	  i.city2("Austin");
	  i.select1();
	  i.personstravel();
	  i.selectchild();
	  i.selectcal();
	  i.selectdate();
	  i.search();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	  //Thread.sleep(10000);
	  
	  b.sort();
	  b.ulSort();
	  b.select();
	  Thread.sleep(4000);
	  b.continuebutton();
	  
	  Thread.sleep(8000);
	  
	  p.selectgender();
	  p.firstname("Tejaswini");
	  p.lastNameInput("Chauhan");
	  p.selectday();
	  p.selectMonth();
	  p.selectYear();
	  p.email("xyz@gmail.com");
	  p.confirmEmail("xyz@gmail.com");
	  p.selectCode();
	  p.mobileNo("8888888888");
	  p.continueButton();
	  
	  Thread.sleep(9000);
	  
	  
	  a.modeofpayment();
	  a.selectmethod();
	  a.checkbox();
	  a.paynowButton();
	  utility.screenshot(driver, "finaloutput");
	  Thread.sleep(4000);
	  
	  closebrowser();
	 // Reporter.log("Browser is closed",true);
  }
}
