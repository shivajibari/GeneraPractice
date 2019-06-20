package General.GeneralPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		// Question: how to simulate the browser back and forth button
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Thread.sleep(45000);
		driver.get("http://html.com/input-type-file/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		//Thread.sleep(5000);
		driver.navigate().to("https://facebook.com");
		Thread.sleep(20000);
		driver.navigate().back();
		Thread.sleep(20000);
		driver.navigate().forward();
		Thread.sleep(20000);
		driver.navigate().back();
		
		
		

	}

}
