package selenium12etc;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1402uploadfilewithAutoITtool {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		/*Uploading the file with selenium key method */
		

          driver.findElement(By.id("drag-drop-upload")).click();
          
           Runtime.getRuntime().exec("C:\\Users\\Whynew.in\\Pictures\\Selenium testing testing\testing1.exe");


//Thread.sleep(6000);
//driver.close();


}


}
