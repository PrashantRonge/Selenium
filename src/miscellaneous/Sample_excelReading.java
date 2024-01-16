package miscellaneous;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sample_excelReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		CommonlyUsedMethodS.implicitWait(driver, 5);
		
		WebElement mobileNo = driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		WebElement fullName = driver.findElement(By.xpath("//input[@name='fullName']"));
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		
		//Manual Way
//		mobileNo.sendKeys("48569976");
//		fullName.sendKeys("Ram Satpute");
//		userName.sendKeys("Ram@123");
//		password.sendKeys("15791");
		
		//Excel Data Way
		mobileNo.sendKeys(CommonlyUsedMethodS.excelTableDataRead(4, 0));
		fullName.sendKeys(CommonlyUsedMethodS.excelTableDataRead(4, 1));
		userName.sendKeys(CommonlyUsedMethodS.excelTableDataRead(4, 2));
		password.sendKeys(CommonlyUsedMethodS.excelTableDataRead(4, 3));
		
		
		
		
	}

}
