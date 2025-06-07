import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts1 {

	public static void main(String[] args) throws Exception {
		// Setup ChromeDriver using WebDriverManager
				WebDriverManager.chromedriver().setup();

				// Launch Chrome
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();

				// Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				// launch URL
				driver.get("https://demoqa.com/alerts");
				Thread.sleep(2000);
				
				//Handle alerts using JavascriptExecutor(type cast)
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				
				//scroll the screen from top to bottom
		        Thread.sleep(5000);
		        jse.executeScript("window.scrollBy(0,500)");
				try {
					jse.executeScript("document.getElementById('confirmButton').click()");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				//Accept alert
				Thread.sleep(2000);
				driver.switchTo().alert().getText();
				driver.switchTo().alert().accept();
				System.out.println("Alert accepted");
				
				//Dismiss alert
				Thread.sleep(2000);
				try {
					jse.executeScript("document.getElementById('confirmButton').click()");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.switchTo().alert().dismiss();
				System.out.println("Alert dismissed");
				
				//close the driver
				driver.quit();
				

	}

}
