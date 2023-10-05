package sessionday2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo901waitsE {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		
		driver.get("https://www.google.co.in/");

		driver.findElement(By.name("q")).sendKeys("selenium"+Keys.ENTER);
		
		
		
		
		Thread.sleep(3000);
		
		driver.close();
		
	}
	
	
	
}
