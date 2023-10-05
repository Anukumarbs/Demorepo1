package sessoinday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo502 {
	
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		// X path attribute contains approach
		
		String Signup =driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).getText();
		System.out.println(Signup);
		
		String normaltext =driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).getText();
		System.out.println("It coming from normalize place "+ normaltext);
		
		
	Thread.sleep(3000);	
	driver.close();
	}
	

}
