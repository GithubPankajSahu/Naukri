package testPack;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module.LogInPage;
import pages.HomePage;

public class TestClass4ForgotPassword {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");		
		
		HomePage homePage = new HomePage(driver);
		homePage.clickOnLoginButton();
		
		LogInPage logInPage = new LogInPage(driver);
		logInPage.clickOnForgotPassword();
		ArrayList<String> address = new ArrayList<String> (driver.getWindowHandles());
		
		driver.switchTo().window(address.get(1));
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}
