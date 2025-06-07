import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {

    public static void main(String[] args) throws NoSuchFieldException, InterruptedException{

        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Launch Chrome
        WebDriver driver = new ChromeDriver();
        
        //Maximize driver window
        driver.manage().window().maximize();

        // Open Google
        Thread.sleep(2000);
        driver.get("https://www.google.com");
        
        //Delete All Cookies
        Thread.sleep(2000);
        driver.manage().deleteAllCookies();
        
        //Navigate method
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("test@gmail.com"); //locating web element using "id"
        
 
        
        //Refresh the browser
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("class@gmail.com"); //locating web element using "name"
        
        //Navigate back
        Thread.sleep(2000);
        driver.navigate().back();
        
        
      //Navigate back
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.findElement(By.xpath("//*[contains(@placeholder, 'Email address or phone number')]")).sendKeys("xpath@gmail.com"); //locating web element using "xpath"
        driver.findElement(By.xpath("//*[@type= 'password']")).sendKeys("123");
        driver.findElement(By.xpath("//*[contains(@type, 'submit')]")).click(); //locating web element using "xpath"
      
        
        // Print page title
        System.out.println("Page title is: " + driver.getTitle());
        
        //Current URL
        System.out.println("Current URL is  : " + driver.getCurrentUrl());
        
       //Close the browser
        driver.close();

        
        
        
    }
}
