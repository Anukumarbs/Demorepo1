package mavendemo01;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo602parent {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		// X path axes with " Parent " keyword
		
		String shopttext = driver.findElement(By.xpath("//*[@title='Contact us']/parent::div")).getText();
	
	System.out.println(shopttext);
	
	Thread.sleep(3000);
	driver.close();
	
	
	}

}
