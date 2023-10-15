package testPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilis.GetScreenshot;
import pages.HomePage;

public class TestClass1SearchJob {
	private String testID = "TC001";

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","E:\\Automation\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		driver.navigate().to("https://www.naukri.com/");
		
		HomePage homePage = new HomePage(driver);
		homePage.sendSkillsDesignationCompanies("Automation Engineer");
		homePage.selectExperience();
		homePage.sendLocation("Noida");
		homePage.clickSearchButton();
		
		GetScreenshot.getScheenShot("testID");
		
		
		driver.navigate().back();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
