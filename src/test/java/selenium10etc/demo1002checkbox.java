package selenium10etc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1002checkbox {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
			
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		
		System.out.println(checkbox1.isDisplayed());
		System.out.println(checkbox1.isEnabled());
		System.out.println(checkbox1.isSelected());
		
		checkbox1.click();
		
		System.out.println("========================================================");
		
		System.out.println(checkbox1.isDisplayed());
		System.out.println(checkbox1.isEnabled());
		System.out.println(checkbox1.isSelected());
		
		
          Thread.sleep(3000);
		driver.close();
}
}
