package selenium10etc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo1202SelectClass {

	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://trytestingthis.netlify.app/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement option  = driver.findElement(By.id("option"));
    
		js.executeScript("window.scrollBy(0,400)");
		
         Select select = new Select(option);
         Thread.sleep(2000);
         select.selectByIndex(1);
         Thread.sleep(2000);
         select.selectByValue("option 2");
         Thread.sleep(2000);
         select.selectByVisibleText("Option 3");
         
         
         
         Thread.sleep(3000);
         
         driver.close();


}
}
