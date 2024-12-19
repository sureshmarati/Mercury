package com.testcase;


import org.testng.annotations.Test;

import com.qa.mercury.Registration;



public class Loginpage extends Base{
	
	
	@Test
	public void LoginTest() {
		Registration rg = new Registration(driver);
		log.info("webpage is opened");
		driver.get(Baseurl);
		log.info("navigated to the page");
		rg.getfirstname(firstname);
		log.info("firstname is entered");
		rg.getlastname(lastname);
		log.info("lastname entered");
		rg.getphone(phone);
		log.info("phone number entered");
		rg.getusername(username);
		log.info("username entered");
		rg.getaddress(address);
		log.info("address entered");
		rg.getcity(city);
		log.info("city entered");
		rg.getstate(state);
		rg.getpostalcode(postalcode);
		rg.getcountry(country);
		rg.getemail(email);
		rg.getpassword(password);
		rg.getconfirmpassword(confirmPassword);
		rg.clicksubmit(click);
	}
}
