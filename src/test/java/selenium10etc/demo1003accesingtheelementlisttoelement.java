package selenium10etc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1003accesingtheelementlisttoelement {

	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
			
		driver.get("http://www.automationpractice.pl/index.php");
		
		List<WebElement> Shopmanu = driver.findElements(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li"));

        System.out.println("The item size is : "+Shopmanu.size());
        
        for(WebElement aa : Shopmanu){
        	
        	try{
        	if(aa.getText().equalsIgnoreCase("Dresses")){
        		aa.click();
        		System.out.println(driver.getTitle());
        		
        	}}catch(StaleElementReferenceException a){
        		
        	}
        	
        }


Thread.sleep(3000);
driver.close();

}
}
