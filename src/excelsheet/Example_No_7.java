package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_No_7 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method 
		FileInputStream myfile = new FileInputStream("D:\\selenium\\29 july.xlsx");
		Workbook myWorkbook = WorkbookFactory.create(myfile);
		Sheet mySheet = myWorkbook.getSheet("Sheet4");
		
		int lastRowNumber = mySheet.getLastRowNum();
		int totalNumRows = lastRowNumber;
		
		short lastCellNum = mySheet.getRow(0).getLastCellNum();
		int totalCellNum = lastCellNum-1;
		
		for(int i=0 ; i<=totalNumRows ; i++)
		{
			for(int j =0 ; j<=totalCellNum ; j++)
			{
				CellType cellDataType = mySheet.getRow(i).getCell(j).getCellType();
			//	System.out.print(cellDataType+" ");
				
				
				if(cellDataType==CellType.STRING)
				{
					String value = mySheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(value+" ");
				}
				else if(cellDataType==CellType.NUMERIC)
				{
					double value = mySheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(value+" ");
				}
				else if(cellDataType==CellType.BOOLEAN)
				{
					boolean value = mySheet.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(value+" ");
				}
					
					
			}
			System.out.println();
		}

	}

}
