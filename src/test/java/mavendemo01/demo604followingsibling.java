package mavendemo01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo604followingsibling {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		String follownigsiblingtext = driver.findElement(By.xpath("//div[@id='contact-link']/following-sibling::span")).getText();
	
		System.out.println(follownigsiblingtext);
		
		Thread.sleep(3000);
		driver.close();
	}

}
