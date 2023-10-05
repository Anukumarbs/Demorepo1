package sessoinday4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo43 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		driver.manage().window().maximize();
		
		List<WebElement> pagelink = driver.findElements(By.tagName("a"));
		
		System.out.println(pagelink.size());
		
		for (WebElement element:pagelink){
			
			System.out.println(element.getText());
			
		
			
		}
		
		
		
	}

}
