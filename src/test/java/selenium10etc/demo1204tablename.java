package selenium10etc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1204tablename {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://trytestingthis.netlify.app/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1600)");
		
		List<WebElement> tablename  = driver.findElements(By.xpath("//tbody/tr[1]/th"));
    
		
		for(WebElement header: tablename){
			
			if(header.getText().contentEquals("Firstname"))
		System.out.println(header .getText());
		}
         
         Thread.sleep(7000);
         
         driver.close();


}


}
