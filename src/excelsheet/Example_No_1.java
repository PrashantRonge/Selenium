package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_No_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		// "" use baocz inbulid // came
		FileInputStream myfile =  new FileInputStream("D:\\selenium\\29 july.xlsx");
		String Playername = WorkbookFactory.create(myfile).getSheet("Sheet2").getRow(4).getCell(1).getStringCellValue();
        System.out.println("String value from excelsheet is -->"+Playername);
		
		FileInputStream myfile2 = new FileInputStream("D:\\\\selenium\\\\29 july.xlsx");
		double player_id = WorkbookFactory.create(myfile2).getSheet("Sheet2").getRow(2).getCell(0).getNumericCellValue();
		System.out.println("Numaric  value from excelsheet is -->"+player_id);
		
		FileInputStream myfile3 = new FileInputStream("D:\\\\selenium\\\\29 july.xlsx");
		boolean player_Status = WorkbookFactory.create(myfile3).getSheet("Sheet2").getRow(3).getCell(3).getBooleanCellValue();
		System.out.println("bollean  value from excelsheet is -->"+player_Status);

	}

}
