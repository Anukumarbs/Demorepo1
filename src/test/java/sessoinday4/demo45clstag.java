package sessoinday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo45clstag {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		driver.manage().window().maximize();
		
		
		// Cssslelcter with Class and combination of Class(we shloud write with ".") and tag
		
		driver.findElement(By.cssSelector(".search_query ")).sendKeys("Classname1");
		
		driver.findElement(By.cssSelector("input.search_query ")).sendKeys("Newclass");
		
			
		
        Thread.sleep(3000);
         driver.close();
	}

}

