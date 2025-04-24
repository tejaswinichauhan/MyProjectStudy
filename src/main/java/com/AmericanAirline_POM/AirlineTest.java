package com.AmericanAirline_POM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class AirlineTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");

		AirlineTest at = new AirlineTest();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.americanairlines.in/intl/in/index.jsp");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

		indexPage i = new indexPage(driver);
		i.radiobutton();
		i.city1("New york");
		Thread.sleep(3000);
		i.select();
		i.city2("Delhi");
		Thread.sleep(3000);
		i.select1();
		i.personstravel();
		Thread.sleep(3000);
		i.selectchild();
		Thread.sleep(3000);
		i.selectcal();
		Thread.sleep(3000);
		i.selectdate();
		Thread.sleep(3000);

		at.ss(driver);
		i.search();
		
		Thread.sleep(50000);
		
		
		bookingPage b=new bookingPage(driver);
		b.sort();
		Thread.sleep(3000);
		b.ulSort();
		Thread.sleep(3000);
        b.select();
        Thread.sleep(3000);
        b.continuebutton();
        Thread.sleep(3000);
        
        personalDetails d=new personalDetails(driver);
        d.selectgender();
        Thread.sleep(1000);
        d.firstname("Janhavi");
        Thread.sleep(1000);
        d.lastNameInput("Kapoor");
        Thread.sleep(1000);
        d.selectday();
        d.selectMonth();
        d.selectYear();
        Thread.sleep(3000);
        d.email("test@gmail.com");
        d.confirmEmail("test@gmail.com");
        d.selectCode();
        d.mobileNo("8888888888");
        Thread.sleep(1000);
        d.continueButton();
        Thread.sleep(3000);
        
        
        paymentPage p=new paymentPage(driver);
        p.modeofpayment();
        Thread.sleep(1000);
        p.selectmethod();
        Thread.sleep(1000);
        p.checkbox();
        Thread.sleep(1000);
        p.paynowButton();
        Thread.sleep(1000);
	}

	public void ss(WebDriver driver) throws IOException {

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\chauh\\OneDrive\\Pictures\\Screenshots\\indexpageSS1.png");
		FileHandler.copy(source, destination);
	}
}
