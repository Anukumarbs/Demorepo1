package TestNG_basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion01 {
	
	@Test
	public void facebook() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.id("q")).sendKeys("water");
        String Expecetedtitle = "Facebook – log in or sign up";
        
       String Actualtitle = driver.getTitle();
       Assert.assertEquals(Actualtitle, Expecetedtitle);
       
       System.out.println("Expecetion is match with real");
       
       
       Thread.sleep(3000);
       driver.close();
       
       
	}

}
