package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_No_2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// TODO Auto-generated method stub
		
		FileInputStream myfile = new FileInputStream("D:\\selenium\\29 july.xlsx");
		Workbook myWorkBook = WorkbookFactory.create(myfile);
		Sheet mySheet = myWorkBook.getSheet("Sheet2");
		Row myRow = mySheet.getRow(1);
		Cell myCell = myRow.getCell(0);
		
//to identify the data-type of cell
		CellType myDatatype = myCell.getCellType();
		System.out.println(myDatatype);
		//.getStringCellValue();

	}

}
