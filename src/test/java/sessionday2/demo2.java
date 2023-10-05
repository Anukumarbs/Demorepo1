package sessionday2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/");
		
		driver.navigate().to("https://www.google.co.in/");
		
		Thread.sleep(3000);
	
	String title = driver.getTitle();
	System.out.println(title);
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	driver.close();
	
	}

}
