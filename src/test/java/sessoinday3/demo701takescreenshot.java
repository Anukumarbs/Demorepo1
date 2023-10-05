package sessoinday3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo701takescreenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		// the object is taking the screenshot and store in virtual memory 
		File ts = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// From the file object we storing the local space
		FileUtils.copyFile(ts, new File("./fullpage.png"));
		
		Thread.sleep(3000);
        driver.close();

	}

}
