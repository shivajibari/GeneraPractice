package General.GeneralPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowsers {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Thread.sleep(45000);
		driver.get("https:\\www.facebook.com");
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		String a= driver.getTitle();
		System.out.println(a);
		
		
		
	}

}
