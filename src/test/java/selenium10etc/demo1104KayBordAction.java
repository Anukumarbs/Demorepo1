package selenium10etc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1104KayBordAction {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		 driver.findElement(By.id("APjFqb")).sendKeys("selenium"+Keys.ENTER);
		
		 
		 Actions act = new Actions(driver);
		 Thread.sleep(3000);
		 
		 act.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		 Thread.sleep(3000);
		
		 
		 System.out.println("pass");
		 driver.close();



}

}
