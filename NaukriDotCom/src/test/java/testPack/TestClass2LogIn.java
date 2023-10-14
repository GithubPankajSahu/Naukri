package testPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module.LogInPage;
import pages.HomePage;

public class TestClass2LogIn {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");		
		
		HomePage homePage = new HomePage(driver);
		homePage.clickOnLoginButton();
		
		LogInPage logInPage = new LogInPage(driver);
		logInPage.sendEnterYourActiveEmailorUserName("beingpankaj@gmail.com");
		logInPage.sendEnterYourpassword("1234567890");
		logInPage.clickOnShowPassword();
		logInPage.clickOnLogInButton();
		 
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
