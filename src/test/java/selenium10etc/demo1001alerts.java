package selenium10etc;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1001alerts {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
			
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		// Handling the JSalert and retrieving the condition text
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

           Alert alert1 = driver.switchTo().alert();
          
           Thread.sleep(3000);
           
           alert1.accept();
	
           if(driver.getPageSource().contains("You successfully clicked an alert")){
        	   
        	   System.out.println("It is handling the JS alert");
           }
           
           System.out.println("===================================================================");
           
        // Handling the JS Conform and retrieving the condition text
   		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

              Alert alert2 = driver.switchTo().alert();
            
              Thread.sleep(3000);
              System.out.println(alert2.getText());
              
              alert2.dismiss();
   	
              if(driver.getPageSource().contains("You clicked: Cancel")){
           	   
           	   System.out.println("It is handling the JS Confirm alert");
              }

              System.out.println("===================================================================");
              
              // Handling the JS prompt and sending text to alert
         		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

                    Alert alert3 = driver.switchTo().alert();
                  
                    Thread.sleep(3000);
                    System.out.println(alert3.getText());
                    
                    Thread.sleep(3000);
                    
                    alert3.sendKeys("JS prompt alart clicked by anu");
                    alert3.accept();
         	
                    Thread.sleep(3000);
                    
                    if(driver.getPageSource().contains("You entered: JS prompt alart clicked by anu")){
                 	   
                 	   System.out.println("It is handling the JS Prompt alert");
                    }
                    System.out.println("===================================================================");
      
           Thread.sleep(3000);
           driver.close();
           
      }	
}
