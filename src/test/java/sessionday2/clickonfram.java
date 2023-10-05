package sessionday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickonfram {

	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		
		WebElement frame = driver.findElement(By.xpath("//ul[@class='nav-list']"));
		
		driver.switchTo().frame(frame);
		Thread.sleep(3000);

		driver.findElement(By.linkText("Overview")).click();
		
		Thread.sleep(3000);
		
		
		driver.close();
		
	}
}
