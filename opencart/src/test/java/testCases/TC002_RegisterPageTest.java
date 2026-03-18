package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC002_RegisterPageTest extends BaseClass {
	
	@Test
	public void verify_register() {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		RegisterPage rp= new RegisterPage(driver);
		rp.fill_register_form("zen", "jacob", "zen1@gmail.com", "45454545", "zen123", "zen123");
		
		
		Assert.assertTrue(rp.isAccountCreatedDisplayed());
	}
}
