import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseSimulation3 {

	public static void main(String[] args) throws Exception {
		// Setup ChromeDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Launch Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// launch URL
		driver.get("https://jqueryui.com/droppable/");
		
		//switch to fram
		driver.switchTo().frame(0);

		// Creating web element reference
		WebElement drag = driver.findElement(By.id("draggable"));
		
		// Creating web element reference
		WebElement drop = driver.findElement(By.id("droppable"));

		// Uing Actions class mouse hover to web element
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(drag, drop);
		System.out.println("Drag and Drop");
		
		
		
		
	
		
       // close the driver
		driver.close();

	}

}
