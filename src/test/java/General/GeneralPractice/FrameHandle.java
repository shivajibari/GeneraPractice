package General.GeneralPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);	//Default page load time is set 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	//this is applicable to all webelements in the page
		
		
		driver.get("https://freecrm.com");
		
		
		
		//Thread.sleep(5000);
		driver.findElement(By.xpath("username")).sendKeys("Shivaji");;
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//inout[@type = 'submit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(), 'contacts')]")).click();
		//If there are multiple frames are there in the page then use switchTO()
		
		driver.switchTo().frame("frame1");   //for name of frame
		driver.switchTo().frame(0);	//by index of frame
		
		
		
		
		System.out.println(driver.getTitle());
	}

}
