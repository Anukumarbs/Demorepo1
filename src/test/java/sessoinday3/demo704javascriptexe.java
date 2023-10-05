package sessoinday3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo704javascriptexe {

public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.nopcommerce.com/");
	
	driver.manage().window().maximize();
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	Thread.sleep(3000);
	
	js.executeScript("location.reload()", "");
	
	Thread.sleep(3000);
	driver.close();
	
	
}	
       
}
