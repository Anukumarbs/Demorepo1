package sessoinday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo503 {
	
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		// X path attribute Starts-with approach
		
		driver.findElement(By.xpath("//input[starts-with(@name,'search_query')]")).sendKeys("starts with");
		
	Thread.sleep(3000);	
	driver.close();
	}

}
