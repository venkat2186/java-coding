import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {

	public static void main(String[] args) {
		// Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Launch Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;  
        
        //launch URL
        driver.get("https://money.rediff.com/gainers");
        
        //get list of all companies
        List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
        System.out.println("Total number of companies:  " + allCompanies.size());
        
       //get current price of all companies
        List<WebElement> currentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
        System.out.println("Total number of companies:  " + currentPrice.size());
        
        String expResult = "Fundviser Capital";
        for (int i = 0; i < allCompanies.size(); i++) {
        	if (allCompanies.get(i).getText().equalsIgnoreCase(expResult)) {
        		System.out.println(allCompanies.get(i).getText() + "  ==  " + currentPrice.get(i).getText()); 
        		allCompanies.get(i).click();
        		System.out.println(driver.getTitle());
        		break;
				
			}
			
		}

	}

}
