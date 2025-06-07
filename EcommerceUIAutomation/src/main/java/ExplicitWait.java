import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
		// Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Launch Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;  
        
        //launch URL
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("Test@gmail.com");
        
        //Fetch input box attribute value
        System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
        
        //Explicit wait
        WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(60));
        wt.until(ExpectedConditions.elementToBeClickable(By.id("pass"))).sendKeys("abcd");
        
        //close the driver
        driver.close();
         

	}

}
