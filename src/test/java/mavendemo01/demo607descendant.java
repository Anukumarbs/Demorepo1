package mavendemo01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo607descendant {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		//String descendanttext = driver.findElement(By.xpath("//ul[@class='toggle-footer']/descendant::a"))
			//	.getText();
	
	//	System.out.println(descendanttext);
		
		List<WebElement> links = driver.findElements(By.xpath("//ul[@class='toggle-footer']/descendant::a"));

for (WebElement  ele: links){
	System.out.println(ele.getText());
}
		
		Thread.sleep(3000);
		driver.close();
	}


}
