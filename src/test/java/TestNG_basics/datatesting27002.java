package TestNG_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class datatesting27002 {

	
	WebDriver driver;

	@Test  (dataProvider = "datas" ,dataProviderClass = data27001.class )
	public void startup(String Username , String password) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys(Username);
		
		driver.findElement(By.name("password")).sendKeys(password );
		
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//button")).click();
		
		
		Thread.sleep(5000);
		driver.close();
	}



}
