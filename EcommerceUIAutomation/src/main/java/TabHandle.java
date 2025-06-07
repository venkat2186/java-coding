import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabHandle {

	public static void main(String[] args) throws Exception {
		// Setup ChromeDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Launch Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// launch URL
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		
		// Tab handling
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		try {
			jse.executeScript("window.scrollBy(0,500)");
			jse.executeScript("document.getElementById('tabButton').click()");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElement(By.id("tabButton")).click();
		Set<String> allTabHandles = driver.getWindowHandles(); ////to fetch all window id's 
		String parentTab = driver.getWindowHandle(); //to fetch single window id 
		System.out.println("Fetch the details of all the tab ID's  : " + allTabHandles);
		System.out.println("Fetch the parent handle ID : " + parentTab);
		
		//using "for each" loop to traverse through the array
		for (String abcd : allTabHandles) {
			driver.switchTo().window(abcd);
			if (abcd.equalsIgnoreCase(parentTab) ) {
				System.out.println("Parent tab title : " +driver.getTitle());
				
			} else {
                System.out.println("Child tab URL : " +driver.getCurrentUrl());
			}
			
		}
		
		//Browser handling
		try {
			driver.switchTo().window(parentTab); //switching to parent browser
			jse.executeScript("window.scrollBy(0,500)");
			jse.executeScript("document.getElementById('windowButton').click()");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Set<String> allBrowserHandles = driver.getWindowHandles(); ////to fetch all browser id's 
		
		
		for (String newWindow : allBrowserHandles) {
			driver.switchTo().window(newWindow);
			System.out.println("Window ID : " + newWindow );
			System.out.println("Title : " +driver.getTitle());
			System.out.println("Current URL : " +driver.getCurrentUrl());
			
		}
		driver.switchTo().defaultContent();
		System.out.println("Switched to Default browser");
		
		
		//close the driver
		driver.quit(); //closes all browser instances
	}

}
