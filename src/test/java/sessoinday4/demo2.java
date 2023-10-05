package sessoinday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php?id_category=3&controller=category");
		
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
		
		driver.findElement(By.partialLinkText("Printed Chiffon Dress")).click();
		
		Thread.sleep(3000);
		
		driver.close();
	}
}
