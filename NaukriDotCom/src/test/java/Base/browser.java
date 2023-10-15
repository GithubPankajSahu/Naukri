package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser {

	public static WebDriver launchChrome() {
		
		WebDriver driver = new ChromeDriver();
		
		return driver;
	}
	
	public static WebDriver launchEdge() {
		
		WebDriver driver = new EdgeDriver();
		
		return driver;
	}
	
	public static WebDriver launchFirefox() {
		
		WebDriver driver = new FirefoxDriver();
		
		return driver;
	}
	
	
	
	
}
