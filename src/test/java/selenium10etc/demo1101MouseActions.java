package selenium10etc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1101MouseActions {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
			
		driver.get("https://selenium08.blogspot.com/");
		
		WebElement rigthclick = driver.findElement(By.xpath("//a[text () = 'Vertical Scroll']"));
		
		Actions act = new Actions(driver);
		
		/* Mouse is hover over the element */
		act.moveToElement(rigthclick);
		
		/*Click on the element */
		//act.contextClick();
		
		/*To perform double click action*/ 
		act.doubleClick();
		
		act.build().perform();
		
		
		Thread.sleep(6000);
		driver.close();
		
   }
}
