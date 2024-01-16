package data_Provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TATA_AIG_DataProvider {
	@DataProvider(name= "carInsRegression")
	public static String[][] carInsData()
	{
		String data[][]= {{ "Audi","A3"},{"BENTLEY","BROOKLANDS"},{"MCLAREN","720S"}};
		return data;
		
	}
}
