import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

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
        
        
        //select radiobutton
        //1st way
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value=1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value=2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value=-1]")).click();
        
        
        //2nd way
        List<WebElement> group = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println("Total number of web elements : " + group.size());
        System.out.println(group.get(0).isDisplayed()); //true
        System.out.println(group.get(1).isEnabled()); //true
        System.out.println(group.get(2).isSelected()); //true
        Thread.sleep(2000);
        group.get(1).click();
        System.out.println(group.get(2).isSelected()); //false
        
        //3rd way
        List<WebElement> groupText = driver.findElements(By.xpath("//*[@class='_58mt']"));
        System.out.println("Total number of web elements text : " + groupText.size());
        String expResult = "Custom";
        for (int i = 0; i < groupText.size(); i++) {
        	if (groupText.get(i).getText().equalsIgnoreCase(expResult)) {
        		groupText.get(i).click();
        		System.out.println(expResult +    "    clicked   "  );
				
			}
			
		}
        
        
        //close the browser
        driver.close();

	}

}
