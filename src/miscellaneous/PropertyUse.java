package miscellaneous;

import java.io.IOException;

public class PropertyUse {

	public static void main(String[] args) throws IOException 
	{
		String value1 = CommonlyUsedMethodS.readDataFromPropertiesFile("Name");
		System.out.println(value1);
		String value2 = CommonlyUsedMethodS.readDataFromPropertiesFile("Age");
		System.out.println(value2);
		String value3 = CommonlyUsedMethodS.readDataFromPropertiesFile("Pincode");
		System.out.println(value3);
		String value4 = CommonlyUsedMethodS.readDataFromPropertiesFile("MObnum");
		System.out.println(value4);

	}

}
