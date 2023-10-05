package sessoinday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo501 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		//Absolute x path path for img
		//   /html/body/div/div/div/div/div/div/div/div/ul/li/a/img
		
		
		// Relative X path for img
		
		//    //img[@alt='sample-3']
		
		// X path attribute contains approach
		
		driver.findElement(By.xpath("//input[contains(@id,'search_query_top')]")).sendKeys("hello");
		
		driver.findElement(By.xpath("//*[contains(@id,'search_query_top')]")).sendKeys("bye");
		
	Thread.sleep(3000);	
	driver.close();
	}
	
	
}
