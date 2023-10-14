package testPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.RegisterPage;


public class TestClass5Register {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
		driver.get("https://www.naukri.com/");
		
		HomePage homePage = new HomePage(driver);
		homePage.clickOnRegisterButton();
		
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.sendFullNameField("Samrat Singh");
		registerPage.sendEmailId("samratsingh122.com");
		registerPage.sendPassword("1234567890");
		registerPage.sendMobileNumber("8982649310");
		registerPage.clickOnCheckBoxForWhatsAppUpdate();
		registerPage.clickOnWorkStatus();
		
		Thread.sleep(2000);
		registerPage.clickRegisterNowButton();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
