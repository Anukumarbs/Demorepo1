package sessoinday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo504andor {
	
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://www.automationpractice.pl/");
	
	// X path with OR approach 

	//driver.findElement(By.xpath("//input[@id='search_query_top' or @name='search_query']")).sendKeys("OR statement");
	
	// X path with And approach 

		driver.findElement(By.xpath("//input[@id='search_query_top' and @name='search_query']")).sendKeys("AND statement");

	
	
	Thread.sleep(3000);
	driver.close();
	
}
}
