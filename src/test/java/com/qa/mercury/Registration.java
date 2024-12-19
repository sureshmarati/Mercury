package com.qa.mercury;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
	
		WebDriver driver;
		
		public Registration(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(name = "firstName") WebElement firstName;
		
		@FindBy(name = "lastName") WebElement lastName;
		
		@FindBy(name = "phone") WebElement phone;
		
		@FindBy(name = "userName") WebElement userName;
		
		@FindBy(xpath = "//*[contains(@name, 'address1')]") WebElement address;
		
		@FindBy(name = "city") WebElement city;
		
		@FindBy(name = "state") WebElement state;
		
		@FindBy(name = "postalCode") WebElement postalCode;
		
		@FindBy(name = "country") WebElement country;
		
		@FindBy(id = "email") WebElement email;
		
		@FindBy(name = "password") WebElement password;
		
		@FindBy(name = "confirmPassword") WebElement confirmPassword;
		
		@FindBy(name = "submit") WebElement submit;
		
		public void getfirstname(String fn) {
			firstName.sendKeys(fn);
		}
		
		public void getlastname(String ln) {
			lastName.sendKeys(ln);
		}
		
		public void getphone(String phn) {
			phone.sendKeys(phn);
		}
		
		public void getusername(String un) {
			userName.sendKeys(un);
		}
		
		public void getaddress(String add) {
			address.sendKeys(add);
		}
		
		public void getcountry(String cn) {
			country.sendKeys(cn);
		}
		public void getcity(String cty ) {
			city.sendKeys(cty);
		}
		public void getstate(String st) {
			state.sendKeys(st);
		}
		
		public void getpostalcode(String pst) {
			postalCode.sendKeys(pst);
		}
		
		public void getemail(String eml) {
			email.sendKeys(eml);
		}
		
		public void getpassword(String pass) {
			password.sendKeys(pass);
		}
		
		public void getconfirmpassword(String confirmpwd) {
			confirmPassword.sendKeys(confirmpwd);
		}
		
		public void clicksubmit(String click) {
			submit.click();
		}
}
