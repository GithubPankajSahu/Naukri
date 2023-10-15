package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Base.browser;
import Utility.GetScreenshot;
import pages.HomePage;

public class VerifyEmployerDropDown extends browser {

	private WebDriver driver;
	private HomePage homePage;
	private SoftAssert softAssert;
	
	String testID;
	
	private static ExtentTest test;
	private static ExtentHtmlReporter reporter;

	
	@Parameters("browser")
	
	@BeforeTest
	public void launchBrowser(String browserName) {
		if(browserName.equals("Chrome"))
		{
			driver = launchChrome();
		}
		
		if(browserName.equals("Edge"))
		{
			driver = launchEdge();
		}
		
		if(browserName.equals("Firefox"))
		{
		driver = launchFirefox();
		}
		
		driver.manage().window().maximize();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void createObjects() {
		homePage = new HomePage(driver);
		softAssert = new SoftAssert();
	}
	
	
	@BeforeMethod
	public void goOnSearchButton() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.get("https://www.naukri.com/");
		homePage.sendSkillsDesignationCompanies("Automation Tester");
		homePage.sendLocation("Noida");
		homePage.selectExperience();
		homePage.clickSearchButton();
	}
	
	@Test 
	public void verifyEmployerDropDown(){
		HomePage homePage = new HomePage(driver);
		homePage.clickOnForEmployersDropDown();
	}
	
	@AfterMethod
	public void takeScreenshotOffailedTest(ITestResult result) {

		testID = "TC001";
		
		if(ITestResult.FAILURE == result.getStatus())
		{
			GetScreenshot.takeScreenshot(driver, testID);
		}
	}
	
	@AfterClass
	public void removeObjects() {
		homePage = null;
		softAssert = null;
	}
	
	@AfterTest
	public void closeTheBrowser() {
		driver.quit();
		driver = null;
		System.gc();
	}
	
	
	
	
	
}
