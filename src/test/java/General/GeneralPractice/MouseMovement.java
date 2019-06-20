package General.GeneralPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class MouseMovement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Thread.sleep(45000);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().deleteAllCookies();
		//Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//Action is the class. While using actions class we have to use build().perfrom() at the end of method.
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.name("about us")))
		.moveToElement(driver.findElement(By.name("DropObject")))
		.release().build().perform();
		
		


	}

}
