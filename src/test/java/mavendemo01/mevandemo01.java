package mavendemo01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class mevandemo01 {
	public static void main(String[] args) throws InterruptedException {
		
//		ChromeDriver driver = new ChromeDriver();
		
//		RemoteWebDriver driver = new FirefoxDriver();
		
//		WebDriver driver = new FirefoxDriver();
//		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.11.0");
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
