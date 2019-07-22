package com.gurudemositelogin.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	
	@FindBy(linkText="New Customer")
	static
	WebElement newcustomer;
	
	
	@FindBy(name="password")
	static
	WebElement password;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
	static
	WebElement loginbtn;
	
	
	
	
	
	public static void navigateToNewCustomerScreen() {
		
		newcustomer.click();
		
		
		
	}
	
	
	
}
