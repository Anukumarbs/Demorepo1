package selenium10etc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1103DragAndDropImp {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement outbox = driver.findElement(By.id("draggable"));
		WebElement Bigbox = driver.findElement(By.id("droppable"));
		
		
		Actions act = new Actions(driver);
		
		js.executeScript("window.scrollBy ( 0,400 )");
		
		act.dragAndDrop(outbox, Bigbox).build().perform();
		
		
		
		Thread.sleep(3000);
		driver.close();
		
		
	}


}
