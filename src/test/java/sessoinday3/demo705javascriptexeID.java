package sessoinday3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo705javascriptexeID {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(3000);
		// 1st way to send the data to the Text box
		js.executeScript("document.getElementById('small-searchterms').value='test1';");
		
		Thread.sleep(3000);
		// 2nd way to send the data to the text box
		WebElement searchbox = driver.findElement(By.name("q"));
		
		js.executeScript("arguments[0].value='test2'", searchbox);
		
		Thread.sleep(3000);
		driver.close();
		
		
	}	

}
