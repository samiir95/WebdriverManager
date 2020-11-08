package tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;
import utilities.extendReporting.ExtentTestManager;

//@Listeners(TestAllureListeners.class)
public class SearchProductTest extends TestBase
{
	String productName = "Apple MacBook Pro 13-inch"; 
	SearchPage searchObject ; 
	ProductDetailsPage detailsObject ; 
	
	@Test
	public void UserCanSearchForProducts(Method method) 
	{
		// ExtentReports Description
		ExtentTestManager.startTest(method.getName(), "UserCanSearchForProducts");
		
		searchObject  = new SearchPage(driver); 
		detailsObject = new ProductDetailsPage(driver); 
		searchObject.ProductSearch(productName);
		searchObject.OpenProductDetailsPage();
		Assert.assertEquals(detailsObject.productNamebreadCrumb.getText(), "***");
	}

}
