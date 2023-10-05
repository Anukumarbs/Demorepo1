package sessoinday3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo702objectscreenshot {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement HomeIcon =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
			
		File Iconimage = HomeIcon.getScreenshotAs(OutputType.FILE);
		
         FileUtils.copyFile(Iconimage, new File("./Iconeimage.png"));
         
         
         Thread.sleep(3000);
         driver.close();

	}

}
