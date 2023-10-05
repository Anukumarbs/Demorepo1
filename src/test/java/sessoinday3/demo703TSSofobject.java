package sessoinday3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo703TSSofobject {
	
	
public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement iphone =driver.findElement(By.xpath("//div[@class='nivoSlider']"));
			
		File iphone11 = iphone.getScreenshotAs(OutputType.FILE);
		
         FileUtils.copyFile(iphone11, new File("./iphone11.png"));
         
         
         Thread.sleep(3000);
         driver.close();
	}

}
