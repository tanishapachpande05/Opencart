package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RegisterPage extends BasePage {
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement telephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement confirmPassword;
	
	@FindBy(xpath="//label[normalize-space()='Yes']//input[@name='newsletter']")
	WebElement yesSubscribe;
	
	@FindBy(xpath="//input[@value='0']")
	WebElement noSubscribe;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement checkPrivacyAgree;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement textAccountCreated;
	
	public void fill_register_form(String fname, String lname, String emailid, String tel, String pass, String confirmPass) {
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		email.sendKeys(emailid);
		telephone.sendKeys(tel);
		password.sendKeys(pass);
		confirmPassword.sendKeys(confirmPass);
		
		yesSubscribe.click();
		checkPrivacyAgree.click();
		btnContinue.click();
		
	}
	
	public boolean isAccountCreatedDisplayed() {
		return textAccountCreated.isDisplayed();
	}
}
