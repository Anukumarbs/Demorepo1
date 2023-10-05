package sessionday2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo903explisitwait {
	
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement webelementtext=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		
	/*	WebElement webelementtext =driver.findElement(By.xpath("//p[text()='WebDriver']")); */
		
		Boolean Status = webelementtext.isDisplayed();
		
		if (Status){
			System.out.println("It is displayed ");
			
	      }
		
		Thread.sleep(3000);
		
		driver.close();
		
	}


}
