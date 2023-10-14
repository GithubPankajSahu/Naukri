package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

//	variable private
	
	@FindBy(xpath = "//input[@id='name']")
	private WebElement fullNameField;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailId;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordFieldField;
	
	@FindBy(xpath = "//input[@id='mobile']")
	private WebElement mobileNumber;
	
	@FindBy(xpath = "(//h2[@class='main-3'])[1]")
	private WebElement workStatusField;
	
	@FindBy(xpath = "//button[text()='Register now']")
	private WebElement registerNowButton;
	
	@FindBy(xpath = "//span[text()='Send me important updates on']")
	private WebElement SendMeImportantUpdatesOnWhatsApp;
	
//	constructor
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//	methods public
	
	public void sendFullNameField(String enterFullName) {
		fullNameField.sendKeys(enterFullName);
	}
	
	public void sendEmailId(String enterEmailID) {
		emailId.sendKeys(enterEmailID);
	}
	
	public void sendPassword(String enterPassword) {
		passwordFieldField.sendKeys(enterPassword);
	}
	
	public void sendMobileNumber(String enterMobileNumber) {
		mobileNumber.sendKeys(enterMobileNumber);
	}
	
	public void clickOnWorkStatus() {
		workStatusField.click();
	}
	
	public void clickRegisterNowButton() {
		registerNowButton.click();
	}
	
	public void clickOnCheckBoxForWhatsAppUpdate() {
		SendMeImportantUpdatesOnWhatsApp.click();
	}
	 
	
}
