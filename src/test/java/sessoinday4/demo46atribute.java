package sessoinday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo46atribute {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		driver.manage().window().maximize();
		
					
		// Css slelcter with tag,class [Attribute with value 
		
			//driver.findElement(By.cssSelector("[id-search_query_top]")).sendKeys("Classname1");
				
			driver.findElement(By.cssSelector("input[id=search_query_top]")).sendKeys("Classname1");
        Thread.sleep(3000);
         driver.close();
	}

}
