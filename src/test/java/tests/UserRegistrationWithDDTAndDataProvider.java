package tests;



import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UserRegistrationPage;

public class UserRegistrationWithDDTAndDataProvider extends TestBase
{
	HomePage homeObject ; 
	UserRegistrationPage registerObject ; 
	LoginPage loginObject ; 

//
//	@DataProvider(name="testData")
//	public static Object[][] userData()
//	{
//		return new Object[][] {
//			{"Moataz" , "Nabil","testxxxig8o996@gmail.com","123456"},
//			{"Ahmed","Ali","testuser127oi0g8073@gmail.com","12345678"},
//			{"Ahmed","Ali","testuser127o8i8g0073@gmail.com","12345678"},
//			{"Ahmed","Ali","testuser1270o8ig0793@gmail.com","12345678"}
//		};
//	}

	@Test(priority=1,dataProvider="testData", dataProviderClass= DataProviderIsolate.class)
	public void UserCanRegisterSuccssfully(String fname, String lname , String email , String password ) 
	{
		homeObject = new HomePage(driver); 
		homeObject.openRegistrationPage();
		registerObject = new UserRegistrationPage(driver); 
		registerObject.userRegistration(fname,lname,email,password);
		Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
		registerObject.userLogout();
		homeObject.openLoginPage();
		loginObject = new LoginPage(driver); 
		loginObject.UserLogin(email, password);
		//Assert.assertTrue(registerObject.logoutLink.getText().contains("Log out"));
		registerObject.userLogout();
	}

}
