package data_Provider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fb_SignUp_Level3_XmlData 
{
  @Parameters({"fname","lname","Mno"})   //These 3 are Positional ParaMeters
  @Test
  public void fbTest(String Firstname , String LastName , String MobNUm) throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(500);
	  
	  driver.findElement(By.linkText("Create new account")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  driver.findElement(By.name("firstname")).sendKeys(Firstname);
	  driver.findElement(By.name("lastname")).sendKeys(LastName);
	  driver.findElement(By.name("reg_email__")).sendKeys(MobNUm);
	  Thread.sleep(5000);
	  driver.close();
  }
  
}
