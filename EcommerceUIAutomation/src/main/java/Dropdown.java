import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		// Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Launch Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        //launch URL
        driver.get("https://www.facebook.com/");
        
        //click button in web page
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Create new account']")).click();
        
        //handling dropdown without using "Select" class
        Thread.sleep(2000);
        List<WebElement> day = driver.findElements(By.xpath("//select[@id='month']/option"));
        System.out.println("Total number of data:  " + day);
        day.get(10).click(); //Nov
        
      //handling dropdown using "Select" class
        WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
        Select month = new Select( bm); //Creating "parameterized" constructor
        Thread.sleep(2000);
        month.selectByIndex(8); //Sep
        Thread.sleep(2000);
        month.selectByValue("5"); //April
        Thread.sleep(2000);
        month.selectByVisibleText("Jan"); //Jan
        
       
        
        //handling dropdown using 'getOptions' method
         List<WebElement> year= month.getOptions();
         System.out.println("Total number of year : " + year.size());
         String expResult = "Dec";
         for (int i = 0; i < year.size(); i++) {
        	 if (year.get(i).getText().equalsIgnoreCase(expResult)) {
        		 year.get(i).click(); //Dec
				
			}
			
		}
         
        //handling dropdown using sendkeys
         WebElement bm1 = driver.findElement(By.xpath("//select[@id='month']"));
         bm1.sendKeys("May"); //May
        
        //handling dropdown using sendkeys
         driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Feb"); //Feb
         
        
      //close the browser
        driver.close();
        
       
        

	}

}
