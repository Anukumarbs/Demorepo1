package TestNG_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTesting {
	
WebDriver driver;
	
	@Test  (dataProvider = "Credentials" )
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

	
	@DataProvider (name="Credentials") /*Name for Datarprovider method to use inside testcase*/
	public Object[][] Logininfo(){
		/*Creation of a two dimension array for user name and password*/
		Object[][] data = new Object[4][2];
		/*1.Correct user name and password*/
		data[0][0]  = "Admin";
		data[0][1]  = "admin123";
		/*2.Incorrect user name and password*/
		data[1][0]  = "IncorrectAdmin";
		data[1][1]  = "admin123";
		/*3.Correct user name and Incorrect password*/
		data[2][0]  = "Admin";
		data[2][1]  = "Incorrectadmin123";
		/*3.Incorrect user name and Incorrect password*/
		data[3][0]  = "IncorrectAdmin";
		data[3][1]  = "Incorrectadmin123";
		
		return data;}

}

