package sessionday2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo801sadorrot {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://books-pwakit.appspot.com/");
		
		WebElement shadowHost = driver.findElement(By.tagName("book-app"));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	 WebElement shodowRoot = (WebElement)js.executeScript("return arguments[0].shadowRoot.querySelector('app-header');", shadowHost);
	 
	 WebElement Apptool = shodowRoot.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
	 
	 WebElement bookpin = Apptool.findElement(By.tagName("book-input-decorator"));
	 
	 bookpin.findElement(By.cssSelector("input#input")).sendKeys("Shadow handling");
	  
	 Thread.sleep(3000);
	 
	 driver.close();
	 	
	}
}
