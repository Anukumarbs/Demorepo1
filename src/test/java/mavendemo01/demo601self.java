package mavendemo01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo601self {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		// X path axes with "Self" keyword
		
		String logintext = driver.findElement(By.xpath("//*[@class='login']/self::a")).getText();
		
		System.out.println(logintext);
		
		Thread.sleep(3000);
           driver.close();
	}

}
