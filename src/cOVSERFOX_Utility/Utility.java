package cOVSERFOX_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;

import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.*;
import org.testng.Reporter;

public class Utility 
{
	public static String readDataFromExcelsheet(int row , int cell) throws EncryptedDocumentException, IOException
	{
		Reporter.log("Reading Data from Excel", true);
		FileInputStream myfile =  new FileInputStream("D:\\selenium\\29 july.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("COVEFOXTESTNG");
		String data = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	
//	public static void takeScreenShot(WebDriver driver, String TCID) throws IOException
//	{
//		Reporter.log("Taking ScreenShot", true);
//		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH:mm:ss").format(new Date());
//		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		File dest = new File("D:\\selenium\\screenshot_permanat\\Coverfox"+TCID+"_"+timeStamp+".png");
//		Reporter.log("Saved ScreenShot at "+dest, true);
//	    org.openqa.selenium.io.FileHandler.copy(src, dest);
//	}
	public static void takeScreenShot(WebDriver driver,String TCID) throws IOException
	{
		Reporter.log("Taking ScreenShot", true);
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\selenium\\screenshot_permanat\\coverfox"+TCID+"_"+timeStamp+".png");
		Reporter.log("Saved ScreenShot at"+dest, false);
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		
	}

}
