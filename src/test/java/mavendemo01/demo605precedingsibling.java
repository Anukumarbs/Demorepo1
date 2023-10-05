package mavendemo01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo605precedingsibling {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		String Precedingsiblingtext = driver.findElement(By.xpath("//div[@id='contact-link']/preceding-sibling::div"))
				.getText();
	
		System.out.println(Precedingsiblingtext);
		
		Thread.sleep(3000);
		driver.close();
	}

}
