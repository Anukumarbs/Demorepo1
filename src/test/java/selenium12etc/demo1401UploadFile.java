package selenium12etc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1401UploadFile {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		/*Uploading the file with selenium key method */
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Whynew.in\\Pictures\\Saved Pictures\\test file.bmp");
     

          driver.findElement(By.id("file-submit")).click();



Thread.sleep(4000);
driver.close();


}

}
