package selenium12etc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1301datepicker {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.abhibus.com/bus-ticket-offers");
		
		String Date= "29";
		String Month ="September";
		String Year = "2023";
		driver.findElement(By.id("datepicker1")).click();
		
		
		String currentmonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//div[@class='ui-datepicker-title']/span[1]")).getText();
		
		String currentyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//div[@class='ui-datepicker-title']/span[2]")).getText();
		
		if(currentmonth.equalsIgnoreCase(Month)&& currentyear.equalsIgnoreCase(Year)){
			List<WebElement> dates = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody//td"));
			for (WebElement onedate : dates){
				if (onedate.getText().equalsIgnoreCase(Date)){
					onedate.click();
					break;
				}
				
			}
			
		}
			
		 Thread.sleep(3000);
         
         driver.close();


}


}
