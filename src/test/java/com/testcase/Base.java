package com.testcase;

import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import com.qa.mercury.Registration;

public class Base  {
	public WebDriver driver;
	String Baseurl = "https://demo.guru99.com/test/newtours/register.php";
	 String firstname = "suresh";
	 String lastname = "marati";
	 String phone = "9550137607";
	 String username = "suresh";
	 String address = "peerzadiguda";
	 String city = "hyderabad";
	 String state = "telangana";
	 String postalcode = "500098";
	 String  country = "india";
	 String 	email = "suresh@gmail";
	 String password = "marati@123";
	 String confirmPassword = "marati@123";
	 String click = "click";
	
	 Logger log = Logger.getLogger(Base.class);
	 
	@BeforeClass
	public void setup() {
		
		
		driver = new ChromeDriver();
		log.info("Webpage is opened");
		log.error("error message");
		log.fatal("this is fatal error");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	}

}
