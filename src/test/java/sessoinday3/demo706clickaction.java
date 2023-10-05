package sessoinday3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo706clickaction {
	
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(3000);
		
		WebElement clickbtn = driver.findElement(By.xpath("//button[@class='button-1 search-box-button']"));
		
		js.executeScript("arguments[0].click();", clickbtn);		
			System.out.println("succesfully Clicked");
			
			Thread.sleep(6000);
			driver.quit();
		
	}	

}
