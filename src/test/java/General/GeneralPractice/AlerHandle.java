package General.GeneralPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlerHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Thread.sleep(45000);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().deleteAllCookies();
		//Thread.sleep(5000);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		WebElement go = driver.findElement(By.name("proceed"));
		
		go.click();
		
		Alert alert = driver.switchTo().alert();  //Alert is the interface
		System.out.println(alert.getText());	//to fetch the text on the pop up
		alert.accept();	// To click on the oK button		
		alert.dismiss();  // To click on the cancel button
		
		//String a= driver.getTitle();
		//System.out.println(a);
	}

}
