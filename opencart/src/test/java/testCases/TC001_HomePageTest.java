package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_HomePageTest extends BaseClass {
	
	@Test
	public void verifyHomePage() {
		HomePage hp=new HomePage(driver);
		
		Assert.assertTrue(hp.verifyHomePage());
	}

}
