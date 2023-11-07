package TestNG_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo20002 {
	
WebDriver driver;
	
	@Test
	public void google() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

			driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("TestNG"  + Keys.ENTER);
		
	     Thread.sleep(3000);
		
		driver.close();
		
	}


	@Test
	public void facebook() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

			driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("TestNG"  + Keys.ENTER);
		
	     Thread.sleep(3000);
		
		driver.close();
		
	}

}
