package TestNG_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngDemo01 {
	
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
	
	@AfterTest
	public void endup() throws InterruptedException {
		
         Thread.sleep(3000);
		 driver.close();
		
	}

}
