package selenium10etc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1102draganddrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		JavascriptExecutor jb = (JavascriptExecutor)driver;
		
		WebElement BoxA = driver.findElement(By.xpath("//li[@name='A']"));
		WebElement BoxD = driver.findElement(By.xpath("//li[@name='D']"));
		
		Actions act = new Actions(driver);
		
		jb.executeScript("window.scrollBy ( 0,400 )");
		
		act.moveToElement(BoxA);
		Thread.sleep(2000);
		
		act.clickAndHold();
	
		act.clickAndHold(BoxD);
		Thread.sleep(2000);
		act.build().perform();
		Thread.sleep(2000);
		act.release().perform();
		
		
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
