package Tests;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.gurudemositelogin.Page.HomePage;
import com.gurudemositelogin.Page.LoginPages;

import Helper.BrowserFactory;

public class LoginPageTestCase {

	static WebDriver driver;
	
	@Test
	public static void checkValidLogin() {
		
		driver = BrowserFactory.startBrowser("chrome", "http://www.demo.guru99.com/v4/");
		
		LoginPages loginpage = PageFactory.initElements(driver, LoginPages.class);
		
		loginpage.Verifyinvalidlogin("mngr186699", "UpyvYrY");			
			
		
		}
	@Test
	public static void addNewCustomer() {
		
		HomePage.navigateToNewCustomerScreen();
		
		driver.quit();
	}
	
	
}
