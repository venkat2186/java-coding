import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {
		// Setup ChromeDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Launch Chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// launch URL
		driver.get("https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_a7e61fe4-58fa-48ef-bb5d-8b2f6936543d_1_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L0_view-all&cid=ZRQ4DKH28K8J");

		// Creating web element reference
		WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));

		// Using Actions class mouse hover to web element
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(electro).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Realme']")).click();
		System.out.println("Realme is clicked");
		
		//keyboard action
		WebElement men = driver.findElement(By.xpath("//*[text()='Men']"));
		act.sendKeys(men, Keys.ENTER).build().perform();
		System.out.println("Men is clicked");
		
		//Right click on web page
		Thread.sleep(2000);
		act.contextClick(electro).build().perform();
		System.out.println("Right clicked on web page");
		
       // close the driver
		driver.close();

	}

}
