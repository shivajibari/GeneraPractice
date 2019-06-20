package General.GeneralPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Thread.sleep(45000);
		driver.get("http://html.com/input-type-file/");
		driver.manage().deleteAllCookies();
		//Thread.sleep(5000);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		

		//if the file upload or browse button type as File only then following code will work for uploading file
		WebElement file = driver.findElement(By.id("fileupload"));
		file.sendKeys("D:\\chaitali Baviskar (1).docx");		//This will upload the file without clicking the browser button
		
		
		
		
	}

}
