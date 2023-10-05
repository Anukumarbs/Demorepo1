package sessionday2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demomaximize {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		
		int heigth = driver.manage().window().getSize().getHeight();
		int width = driver.manage().window().getSize().getWidth();
		
		System.out.println(heigth);
		System.out.println(width);
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(3000);
		
		driver.close();

	}
}
