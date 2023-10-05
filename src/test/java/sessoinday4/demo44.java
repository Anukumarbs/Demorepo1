package sessoinday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo44 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		driver.manage().window().maximize();
		
		
		// Cssslelcter with id and combination of id(we shloud write with "#") and tag
		driver.findElement(By.cssSelector("#search_query_top")).sendKeys("test");
		
		driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("renamed");
		
		
        Thread.sleep(3000);
         driver.close();
	}

}
