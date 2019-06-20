package General.GeneralPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

	public static void main(String[] args) {
		
		//To handle the Window popups in the selenium, we use Window Handler API
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("//a[contains(text(), 'Good PopUp #3')]")).click();
		
		//This will give us set of all window handles
		Set<String> handler = driver.getWindowHandles();
		
		//to iterate through set, we need to use the iterator
		Iterator<String> it = handler.iterator();
		
		
		String parentWindowTitle, childWindoTitle;
		
		//it.next() will give us parent handle and again after next for child window
		parentWindowTitle = it.next();
		System.out.println("Parent Window"+ parentWindowTitle);
		
		childWindoTitle = it.next();
		System.out.println("Child Window" + childWindoTitle);
		
		System.out.println( "Child Window Title  "+driver.switchTo().window(childWindoTitle).getTitle());
		
		System.out.println ("Parent Window Title  "+driver.switchTo().window(parentWindowTitle).getTitle());
		
		
		
		
	}

}
