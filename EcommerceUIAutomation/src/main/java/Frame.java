import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) throws Exception {
		// Setup ChromeDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Launch Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// launch URL
		driver.get("https://paytm.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		
		//Fetch total number of frames
		Thread.sleep(2000);
		int allFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total number of frames: " + allFrames);
		
		//Verify that the frame is present or not
		for (int i = 0; i < allFrames; i++) {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(i);
			driver.switchTo().frame(i);
			String expResult = "Open Paytm App";
			String actResult = driver.findElement(By.xpath("//*[text()='Open Paytm App']")).getText();
			System.out.println(actResult);
			if (actResult.equalsIgnoreCase(expResult)) {
				System.out.println(" Frame is present"); 
				break;
				
				
			}else {
				System.out.println("Frame is not present");
			}
			
			
			
			
		} 
		
		//Close the driver
		driver.quit();
	}

}
