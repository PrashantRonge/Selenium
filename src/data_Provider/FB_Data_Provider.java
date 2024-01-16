package data_Provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FB_Data_Provider {
  
	//method---->Data provider
	// String Firstname , String LastName , String MobNUm
	
	@DataProvider(name = "FbRetesting")
	public static String[][] FbdataSet()
	{
		String info[][]= {{"Ganseh","Rajput","7785951489"},{"Abhishek","Sonwane","9885951489"},{"Ruturaj","Nale","7787851489"}};
		return info;
	}
	@DataProvider(name = "FbRgression")
	public static String[][] FbdataSet1()
	{
		String info[][]= {{"Aarti","Pitle","7785951489"},{"Gaytri","Rajmane","9885951489"},{"Rutuja","Rajpure","7787851489"}};
		return info;
	}
}
