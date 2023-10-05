package sessionday2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class demotab {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/");
		
		String originalwindow = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		//driver.switchTo().newWindow(WindowType.TAB);

		driver.navigate().to("https://www.google.co.in/");
		
		Thread.sleep(3000);
	   driver.switchTo().window(originalwindow);

	   Thread.sleep(3000);
	   
		driver.close();
		
		
	}
}
