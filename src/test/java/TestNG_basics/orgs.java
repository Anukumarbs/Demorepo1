package TestNG_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class orgs {
	
WebDriver driver;
	
	@Test
	public void startup() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin"  + Keys.ENTER);
		
		driver.findElement(By.name("password")).sendKeys("admin123" );
		
		driver.findElement(By.xpath("//button")).click();
	}
		
		@AfterTest
		public void nd() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("apple" +Keys.ENTER);
		
		Thread.sleep(2000);
		driver.close();
		
	}


}

