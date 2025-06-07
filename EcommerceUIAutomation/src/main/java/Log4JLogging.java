import java.time.Duration;
import java.util.concurrent.TimeUnit;

//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.log4j.Logger;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Log4JLogging {

	public static void main(String[] args) {
		
		//Create logger instance
		Logger logger = Logger.getLogger(Log4JLogging.class);

		
		//Configure log4j properties file
		PropertyConfigurator.configure("C:\\eclipse-workspace\\selenium-demo\\src\\test\\resources\\log4j.properties");
		
		//Open browser instance
		// Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        //Launch Application
        // Launch Chrome
        WebDriver driver = new ChromeDriver();
		logger.info("Opened browser instance");
        
        
        //launch URL
        driver.get("https://www.google.com/");
        logger.info("URL instance");
		
		//Maximize window
        driver.manage().window().maximize();
        logger.info("Maximized window");
		
       //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        logger.info("Implicit given");
		
		
		
		//Check if the element is displayed or not
        try {
			driver.findElement(By.xpath("emails")).isDisplayed();
			logger.info("Web element found");
		} catch (Exception e) {
			logger.info("Web element is not found");
		}
        
        //close the driver
        driver.quit();
	}

}
