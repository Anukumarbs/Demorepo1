package mavendemo01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo606childtext {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		String Childtext = driver.findElement(By.xpath("//div[@id='contact-link']/child::a"))
				.getText();
	
		System.out.println(Childtext);
		
		Thread.sleep(3000);
		driver.close();
	}


}
