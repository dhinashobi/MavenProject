package com.gurudemositelogin.Page;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPages {

	
	static WebDriver driver;
		
		
	@FindBy(name="uid")
	static
	WebElement userID;
	
	
	@FindBy(name="password")
	static
	WebElement password;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
	static
	WebElement loginbtn;
	
	@FindBy(linkText="New Customer")
	WebElement newCustomer;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[3]/td[2]/input[2]")
	WebElement resetbtn;
	
	
	public  void Verifyinvalidlogin(String username, String pass) {
		
	
		
		userID.sendKeys(username);
		
		password.sendKeys(pass);
		
		loginbtn.click();
		
		
		
				
	}
	
	public  void verifywithvalidlogin() {
		
		
		
	}
	
	
}
