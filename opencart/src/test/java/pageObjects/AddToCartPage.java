package pageObjects;

import javax.sound.midi.VoiceStatus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage {
	
	@FindBy(xpath = "//i[@class='fa fa-home']")
	WebElement btnBackToHome;
	
	@FindBy(xpath = "//div[@id='content']//div[1]//div[1]//div[3]//button[1]//span[1]")
	WebElement firstItem;
	
	@FindBy(xpath = "//body//div[@id='common-home']//div[@class='row']//div[@class='row']//div[2]//div[1]//div[3]//button[1]//span[1]")
	WebElement secondItem;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement addToCartSuccessMsg;
	
	public void backtoHomePage() {
		btnBackToHome.click();
	}
	
	public void addFirstItemInCart() {
		firstItem.click();	
	}
	
	public void addSecondItemInCart() {
		secondItem.click();
	}
	
	public boolean isSuccessMsgVisible() {
	  return addToCartSuccessMsg.isDisplayed();
	}
	
	

}
