import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingExcelFile {

	public static void main(String[] args) throws Exception {
		//Specify the location of Excel file
		File src = new File("C:\\eclipse-workspace\\selenium-demo\\src\\test\\resources\\Excel_test_data.xlsx");
		
		//Load the File
		FileInputStream fis = new FileInputStream(src);
		
		//Load workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//Load worksheet
		XSSFSheet sh = wb.getSheet("sheet1");
		
		//Print the loaded sheet
		System.out.println(sh.getSheetName());
		
		//print values from excel sheet
		try {
			System.out.println(sh.getRow(4).getCell(5).getStringCellValue());
			//print integer value from excel sheet
			System.out.println((int) sh.getRow(2).getCell(1).getNumericCellValue());
			
			//total number of rows - 1st way
			System.out.println("Total rows :  " +sh.getPhysicalNumberOfRows());
					
			//total number of rows - 2nd way
			System.out.println("Total rows :  " +sh.getLastRowNum()+1);
			
			//total number of columns - 1st way
			System.out.println("Total columns :  " +sh.getRow(2).getPhysicalNumberOfCells());
			
			//total number of columns - 2nd way
			System.out.println("Total columns :  " +sh.getRow(2).getLastCellNum());
			
			//Real time implementation
			// Setup ChromeDriver using WebDriverManager
	        WebDriverManager.chromedriver().setup();

	        // Launch Chrome
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        //Implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;  
	        
	        //launch URL
	        driver.get("https://www.facebook.com/");
	        
	        //enter username from excel sheet
	        String abc = sh.getRow(1).getCell(1).getStringCellValue();
	        driver.findElement(By.xpath("email")).sendKeys("abc");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
