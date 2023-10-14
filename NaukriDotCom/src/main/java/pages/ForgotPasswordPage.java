package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage {

//	variables= private
	
	@FindBy(xpath = "//label[text()='Email ID']")
	private WebElement emailIDRadioButton;
	
	@FindBy(xpath = "//label[text()='Username']")
	private WebElement userNameRadioButton;
	
	@FindBy(xpath = "//input[@id='usernameField']")
	private WebElement enterEmailIDField;
	
	@FindBy(xpath = "//button[text()='GO']")
	private WebElement goButton;
	
	@FindBy(xpath = "")
	private WebElement enterOtpField;
	
	@FindBy(xpath = "")
	private WebElement resendOtpLink;
	
	@FindBy(xpath = "")
	private WebElement submitButton;
	
	@FindBy(xpath = "//span[text()='Sign in with Google']")
	private WebElement signInWithGoogleLink;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
