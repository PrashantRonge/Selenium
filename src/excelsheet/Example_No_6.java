package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_No_6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream myfile = new FileInputStream("D:\\selenium\\29 july.xlsx");
		Workbook myWorkbook = WorkbookFactory.create(myfile);
		Sheet mySheet = myWorkbook.getSheet("Sheet3");
		
		int lastroN = mySheet.getLastRowNum();
		int Totalrows = lastroN;
		System.out.println(Totalrows);
		
		short lastCellN = mySheet.getRow(0).getLastCellNum();
		int TotalCellsnum = lastCellN-1;
	    System.out.println(TotalCellsnum);
	    
	    for(int i=0 ;i<=Totalrows;i++)
	    {
	    	for(int j=0 ; j<=TotalCellsnum;j++)
	    	{
	    		String value = mySheet.getRow(i).getCell(j).getStringCellValue();
	    		System.out.print(value+"  ");
	    	}
	    	System.out.println();
	    }
	}

}
