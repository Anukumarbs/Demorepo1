package selenium10etc;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1201Ss {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		WebElement fy = driver.findElement(By.id("APjFqb"));
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.SHIFT).sendKeys(fy, "selenium  ").keyUp(Keys.SHIFT).sendKeys("selenium"+Keys.ENTER).build().perform();
		
		Thread.sleep(3000);
		
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_F5);
		rb.keyRelease(KeyEvent.VK_F5);
		
		Thread.sleep(9000);
		
		System.out.println("pass");
		driver.close();
		
		
		
		
		
		
	}

}
