import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws Exception {
		//Specify the location of config properties file
		File src1 = new File("C:\\eclipse-workspace\\selenium-demo\\Repository\\config.properties");
		//Create FileInputStream class object to load the file
		FileInputStream fis1 = new FileInputStream(src1);
		//Create  properties class object to read properties file
		Properties pro1 = new Properties();
		pro1.load(fis1);
		
		
		//Specify the location of locators properties file
		File src2 = new File("C:\\eclipse-workspace\\selenium-demo\\Repository\\locators.properties");
		//Create FileInputStream class object to load the file
		FileInputStream fis2 = new FileInputStream(src2);
		//Create  properties class object to read properties file
		Properties pro2 = new Properties();
		pro2.load(fis2);
				
	  
		//Specify the location of testdata properties file
		File src3 = new File("C:\\eclipse-workspace\\selenium-demo\\Repository\\testdata.properties");
		//Create FileInputStream class object to load the file
		FileInputStream fis3 = new FileInputStream(src3);
		//Create  properties class object to read properties file
		Properties pro3 = new Properties();
		pro3.load(fis3);
		
		
		
		// Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Launch Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;  
        
        //launch URL
        driver.get(pro1.getProperty("URL_1"));
        
        //'getProperty' method will accept key and return the value of that key
        Thread.sleep(5000);
        try {

        	driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("TestData1"));
        	driver.findElement(By.xpath(pro2.getProperty("Password"))).sendKeys(pro3.getProperty("TestData2"));
	        Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        driver.close();

	}

}
