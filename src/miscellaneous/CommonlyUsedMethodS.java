package miscellaneous;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonlyUsedMethodS 
{
	//Reading Data From Excel
	//Taking ScreenShot
	//Scrolling
	//Waiting
	
	public static void takeScreenshot(WebDriver driver,String fileName) throws IOException
	{
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\selenium\\screenshot_permanat\\"+fileName+".png");
		FileHandler.copy(src, dest);
	}
	
	public static void scrollInView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
	}
	
	public static void implicitWait(WebDriver driver, int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
//--------------------------------------------------------------------------\\	
	
//	public static void excelRead(String filepath ,String sheetname ) throws EncryptedDocumentException, IOException
//	{
////		FileInputStream myfile = new FileInputStream( filepath);
////		Workbook myWorkbook = WorkbookFactory.create(myfile);
////		Sheet mySheet = myWorkbook.getSheet(sheetname);
//		
//		
//	}
	
//--------------------------------------------------------------------------\\	

	public static String excelTableDataRead(int row , int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile = new FileInputStream("D:\\selenium\\29 july.xlsx");
		Workbook myworkbook = WorkbookFactory.create(myfile);
		Sheet mysheet = myworkbook.getSheet("Sheet6");
		String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
		
		
	}
	public static String excelTableDataRead(String Sheet, int row , int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile = new FileInputStream("D:\\selenium\\29 july.xlsx");
		Workbook myworkbook = WorkbookFactory.create(myfile);
		Sheet mysheet = myworkbook.getSheet(Sheet);
		String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	public static String readDataFromPropertiesFile(String key) throws IOException
	{
		//Create Object Of Properties class
		Properties p1 = new Properties();
		//File Location
		FileInputStream myfile = new FileInputStream("C:\\Users\\Prashant\\eclipse-workspace\\prashantselemium\\CoverFoxProperty.properties");
		//Load File
		p1.load(myfile);
		//Pass The Key For The Data We Want
		String value = p1.getProperty(key);
		return value;
		
	}
	public static String prorReadDataFromPropertiesFile(String key) throws IOException
	{
		String path = System.getProperty("user.dir");
		System.out.println(path);
		//Create Object Of Properties class
		Properties p1 = new Properties();
		//File Location
		//FileInputStream myfile = new FileInputStream("C:\\Users\\Prashant\\eclipse-workspace\\prashantselemium\\CoverFoxProperty.properties");
		FileInputStream myfile = new FileInputStream(System.getProperty("user.dir")+"\\CoverFoxProperty.properties");
		//Load File
		p1.load(myfile);
		//Pass The Key For The Data We Want
		String value = p1.getProperty(key);
		return value;
		
	}

}
