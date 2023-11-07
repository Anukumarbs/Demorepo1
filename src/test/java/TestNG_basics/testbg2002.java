package TestNG_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testbg2002 {
	
WebDriver driver;
	
	@BeforeTest
	public void startup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		}
	

	@Test
	public void execute() {
		
				
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("TestNG"  + Keys.ENTER);
		
	}
	
	@Test
	public void select() throws InterruptedException {
		Actions act = new Actions(driver) ; 
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		
	}
	
	@AfterTest
	public void endup() throws InterruptedException {
		
         Thread.sleep(3000);
		
		driver.close();
		
	}


}
