package TestNG_basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Webdriverfactory {
	
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void start(@Optional ("edge") String browser) {
		
		switch (browser) {
		
		case "chrome":
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		break;
		
		case "Firefox":
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			break;
			
		case "edge":
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			break;
			
			default:
				System.out.println("you have entered roung keyword");
			
				}
	}
	
	@Test
	public void facebook() {
		driver.get("https://www.facebook.com/login/");
	}
	
	@AfterTest
	public void end () throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

}
