package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_No_4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile  = new FileInputStream("D:\\selenium\\29 july.xlsx");
		Workbook myWorkbook = WorkbookFactory.create(myfile);
		Sheet mySheet = myWorkbook.getSheet("Sheet1");
		
//## Read Whole Excel Sheet
		
		//Outer Forlopp--->row
		for(int i = 0 ; i<=1 ; i++)
		{
			//Inner For Loop --->cellS
			for(int j = 0 ; j<=2 ; j++)
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"    ");
			}
			System.out.println();
		}

	}

}
