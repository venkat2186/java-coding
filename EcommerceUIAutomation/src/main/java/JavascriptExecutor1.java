import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutor1 {

	public static void main(String[] args) throws Exception {
		// Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Launch Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;  
        
        //launch URL
        driver.get("https://www.facebook.com/");
        
        //delete all cookies
        Thread.sleep(2000);
        
        //JavascriptExecutor type casting
        JavascriptExecutor jse =  (JavascriptExecutor) driver;
        
        //locate web element using JavascriptExecutor
        jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
        jse.executeScript("document.getElementsByName('pass')[0].value='Pass@123'");
        jse.executeScript("document.getElementsByName('login')[0].click()");
        
        //scroll the screen from top to bottom
        Thread.sleep(5000);
        jse.executeScript("window.scrollBy(0,500)");
        
        //scroll the screen from bottom to top
        Thread.sleep(5000);
        jse.executeScript("window.scrollBy(0,-500)");
        
        //close the browser 
        driver.close();
        
	}

}
