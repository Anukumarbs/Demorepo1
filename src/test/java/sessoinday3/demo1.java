package sessoinday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		
	 WebDriver driver =new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		
		driver.manage().window().maximize();
		
		WebElement parant = driver.findElement(By.id("frame1"));
		
		driver.switchTo().frame(parant);
	
		String frame1text = driver.findElement(By.xpath("//body[normalize-space()='Parent frame']")).getText();
		System.out.println(frame1text);
	
		WebElement child = driver.findElement(By.xpath("//iframe [@srcdoc='<p>Child Iframe</p>']"));
		
		driver.switchTo().frame(child);
		
		String frame2text = driver.findElement(By.xpath("//body[normalize-space()='Child Iframe']")).getText();
		System.out.println(frame2text);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[normalize-space()='Elements']")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}
	
}
