package sessoinday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo47tagclassatrribute {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		driver.manage().window().maximize();

		// Cssselecetr with tag, Class, atribute with value 
		
       driver.findElement(By.cssSelector("input.search_query[name=search_query]")).sendKeys("last one");		
		
		
		
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
