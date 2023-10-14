package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

//	variable = private
	@FindBy(xpath="//input[@placeholder='Enter your active Email ID / Username']")
	private WebElement enterYourActiveEmailorUserName;
	
	@FindBy(xpath="//input[@placeholder='Enter your password']")
	private WebElement enterYourpassword;
	
	@FindBy(xpath="//small[text()='Show']")
	private WebElement showPassword;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement logInButton;
	
	@FindBy(xpath = "//span[text()='Sign in with Google']")
	private WebElement clickOnSignInWithGoogle;
	
	@FindBy(xpath = "//a[text()='Forgot Password?']")
	private WebElement forgotPassword;
	
	@FindBy(xpath = "//a[@class='close']")
	private WebElement closeLoginPage;
	
	private WebDriver driver;
//	constructor= public
	
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void sendEnterYourActiveEmailorUserName(String enterEmailOrUserName) {
		enterYourActiveEmailorUserName.sendKeys(enterEmailOrUserName);
	}
	
	public void sendEnterYourpassword(String enterPassword) {
		enterYourpassword.sendKeys(enterPassword);
	}
	
	public void clickOnShowPassword() {
		showPassword.click();;
	}
		
	public void clickOnLogInButton() {
		logInButton.click();
	}
		
	public void clickOnSignInWithGoogle() {
		clickOnSignInWithGoogle.click();
	}
		
	public void clickOnForgotPassword() {
		forgotPassword.click();
	}
		
	public void clickCloseLogInPageButton() {
		closeLoginPage.click();
	}
		
	

}
