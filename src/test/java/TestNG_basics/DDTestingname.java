package TestNG_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DDTestingname {
	
WebDriver driver;

@Test  (dataProvider = "Logininfo" ,dataProviderClass = DataOcean.class )
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






	
	@Test  (dataProvider = "searchbox" , dataProviderClass = DataOcean.class )
	public void Nopcommerce (String text) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://demo.nopcommerce.com/");
		
		driver.findElement(By.name("q")).sendKeys(text);
			
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		Thread.sleep(5000);
		driver.close();
	}

	
	

}
