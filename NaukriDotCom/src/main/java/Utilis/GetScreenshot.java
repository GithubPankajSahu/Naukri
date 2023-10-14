package Utilis;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GetScreenshot {

	public static WebDriver driver;
	public static void getScheenShot(String testID) throws IOException {
	
	
		
		try {
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
			
			String timeStamp = dateFormat.format(new Date());
			
			String destinationPath = "E:\\Screenshot"+testID+ timeStamp + ".png";
			
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(destinationPath);
			
			org.openqa.selenium.io.FileHandler.copy(src, dest);
		}
		catch (IOException e) {
            e.printStackTrace();
        }
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
}
