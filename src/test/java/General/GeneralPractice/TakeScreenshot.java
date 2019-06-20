package General.GeneralPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

//import com.google.common.io.Files;

public class TakeScreenshot {

	//private static final String FileUtils = null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Thread.sleep(45000);
		driver.get("http://html.com/input-type-file/");
		driver.manage().deleteAllCookies();
		//Thread.sleep(5000)
		
		//File rc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	 
		FileUtils.copyFile(screenshotFile, new File("E:\\hivaji.png"));
		
		
	}

}
