import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
	
	public static void main(String[] args) {
		// Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Launch Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;  
        
        
        
        //launch URL
        driver.get("https://www.google.com/");
        
      //storing search items in list
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("how Stuff works");
        
       //handling auto suggestions
       List<WebElement>autoSuggestions =  driver.findElements(By.xpath("//ul[@role='listbox']/li"));
       System.out.println("Total items in list : " + autoSuggestions.size());
       String expResult = "how Stuff works science";
       for (int i = 0; i < autoSuggestions.size(); i++) {
    	   if (autoSuggestions.get(i).getText().equalsIgnoreCase(expResult)) {
    		   autoSuggestions.get(i).click();
    		   break;
    		   
			
		}
		
	}
        
        
      //click button in web page
        driver.findElement(By.xpath("//*[text()='Create new account']")).click();
        
        //close the driver
        driver.close();
	}

}
