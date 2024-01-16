package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_No_3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream myfile =  new FileInputStream("D:\\selenium\\29 july.xlsx");
		Workbook myWorkBook = WorkbookFactory.create(myfile);
		Sheet mySheet = myWorkBook.getSheet("Sheet2");
		
//## How to read single row
		
		//1. rowwise format
		for(int i = 0 ; i<=3 ; i++)
		{
		String value = mySheet.getRow(0).getCell(i).getStringCellValue();
		System.out.println(value);
		
		}
		
		//2. single line format
		for(int k = 0 ; k<=3 ; k++)
		{
		String value = mySheet.getRow(0).getCell(k).getStringCellValue();
		System.out.print(value+"  ");
		
		}
		
// ##How to read single cell
		
		//1. rowwise format
		for(int j = 0 ; j<=6 ; j++)
		{
			String values = mySheet.getRow(j).getCell(1).getStringCellValue();
			System.out.println(values);
		}
		
		//2. single line format
		for(int p = 0 ; p<=6 ; p++)
		{
			String values = mySheet.getRow(p).getCell(1).getStringCellValue();
			System.out.print(values+"  ");
		}

	}

}
