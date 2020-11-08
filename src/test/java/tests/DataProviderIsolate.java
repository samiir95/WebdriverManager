package tests;

import org.testng.annotations.DataProvider;

public class DataProviderIsolate {

	
	@DataProvider(name = "testData")
	public static Object[][] userData()
	{
		return new Object[][] {
			{"Moataz" , "Nabil","testxxx88996@gmail.com","123456"},
			{"Ahmed","Ali","testuser12708073@gmail.com","12345678"},
			{"Ahmed","Ali","testuser127880073@gmail.com","12345678"},
			{"Ahmed","Ali","testuser127080793@gmail.com","12345678"}
		};
	}
}
