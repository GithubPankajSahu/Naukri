package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;

public class VerifyMainPageButtons {

	private WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.navigate().to("https://www.naukri.com/");
	}
	
	@Test (priority = 1)
	public void verifySearchButton() {
		HomePage homePage = new HomePage(driver);
		homePage.sendSkillsDesignationCompanies("Automation Tester");
		homePage.sendLocation("Indore", "Noida", "Gurugram");
		homePage.selectExperience();
		homePage.clickSearchButton();
	}
	
	@Test (priority = 2)
	public void verifyLogInButton() {
		HomePage homePage = new HomePage(driver);
		homePage.clickSearchButton();
	}
	
	@Test (priority = 3)
	public void verifyRegisterButton(){
		HomePage homePage = new HomePage(driver);
		homePage.clickOnRegisterButton();
	}
	
	@Test (priority = 4)
	public void verifyForEmployerDropDown(){
		HomePage homePage = new HomePage(driver);
		homePage.clickOnForEmployersDropDown();
	}
	
	@AfterMethod
	public void closeTheBrowser() {
		driver.quit();
	}
	
	
	
	
	
}
