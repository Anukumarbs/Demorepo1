package mavendemo01;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo603anssiter {

	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		// X path axes with " Ancestor " keyword
		
		String shopttext = driver.findElement(By.xpath("//a[@class='login']/ancestor::div")).getText();
	
	System.out.println(shopttext);
	
	Thread.sleep(3000);
	driver.close();
	
	
	}

}
