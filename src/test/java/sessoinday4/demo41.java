package sessoinday4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo41 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		driver.findElement(By.id("search_query_top")).sendKeys("order1");
		
		List<WebElement> slider= driver.findElements(By.className("homeslider-container"));
		
		System.out.println(slider.size());
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
