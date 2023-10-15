 package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
//	variable = private
	@FindBy(xpath="(//input[@class='suggestor-input '])[1]")
	private WebElement enterSkillsDesignationCompanies;
		  
	@FindBy (xpath="//input[@id='expereinceDD']")
	private WebElement selectExperience;
	
	@FindBy(xpath="(//input[@class='suggestor-input '])[2]")
	private WebElement enterLoation;
	
	@FindBy(xpath="//div[@class='qsbSubmit']")
	private WebElement searchButton;
	
	@FindBy(xpath = "//a[@id='login_Layer']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[@id='register_Layer']")
	private WebElement registerButton;
	
	@FindBy(xpath = "//a[@id='register_Layer']")
	private WebElement jobsTab;
	
	@FindBy(xpath = "//div[text()='Companies']")
	private WebElement companiesTab;
	
	@FindBy(xpath = "//div[text()='Services']")
	private WebElement servicesTab;
	
	@FindBy(xpath = "//div[text()='For employers']")
	private WebElement forEmployersDropDown;
	
	@FindBy(xpath = "//div[text()='Post a job']")
	private WebElement selectPostAJobOption;
	
	@FindBy(xpath = "//div[text()='Buy online']")
	private WebElement selectBuyOnlineOption;
	
	@FindBy(xpath = "//div[text()='Employer Login']")
	private WebElement selectEmployerLoginOption;
	
	@FindBy(xpath = "//span[text()='3 years']")
	private WebElement numbersOfYearExperience;  
	
	
	private WebDriver driver;
	private Actions actions;
//	Constructor = public
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		actions = new Actions(driver);
	}
		 
//	method= public
	public void sendSkillsDesignationCompanies(String enterDesignationSkillOrCompanies) {
		enterSkillsDesignationCompanies.sendKeys(enterDesignationSkillOrCompanies);
	}
	
	public void selectExperience() {
		actions.moveToElement(selectExperience).click().build().perform();
		actions.moveToElement(numbersOfYearExperience).click().perform();
		
	}
	
	public void sendLocation(String enterCityName1) {
		enterLoation.sendKeys(enterCityName1);
	}
	
	public void clickSearchButton() {
		searchButton.click();
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public void clickOnRegisterButton() {
		registerButton.click();
	}
	public void clickOnForEmployersDropDown() {
		actions.moveToElement(forEmployersDropDown).build().perform();
		actions.moveToElement(selectPostAJobOption).click().build().perform();
//		actions.moveToElement(selectBuyOnlineOption).click().build().perform();
//		actions.moveToElement(selectEmployerLoginOption).click().build().perform();

	}
	
	public void clickOnJobTab() {
		actions.moveToElement(jobsTab).build().perform();

	}
	
	public void clickOnCompaniesTab() {
		actions.moveToElement(companiesTab).build().perform();

	}
	
	public void clickOnServicesTab() {
		actions.moveToElement(servicesTab).build().perform();

	}
	
	
	
	
	
	
	
	
	
			
}
