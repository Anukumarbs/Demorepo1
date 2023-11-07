package TestNG_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleStore {
	
WebDriver driver;
	
	@Test
	public void startup() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://demo.midtrans.com/");
		
		driver.findElement(By.xpath("//a[@class='btn buy']")).click();
		
		driver.findElement(By.xpath("//input[@value='Budi']")).sendKeys("ball" + Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@value='081808466410']")).sendKeys("123456789");
		
		driver.findElement(By.xpath("//input[@value='10220']")).sendKeys("12345");
		
		driver.findElement(By.tagName("//div[@class='cart-checkout']")).click();
		
		//driver.findElement(By.partialLinkText("MidPlaza 2, 4th Floor Jl.Jend.Sudirman Kav.10-11")).sendKeys("hi");
		
	}


}
