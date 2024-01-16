package testNG_Hard_Soft_Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NormalTestValidations {
  @Test
  public void Validate_FB_Gender_CheckBox() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(500);
	  driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
	  Thread.sleep(1000);
	  boolean radioButtonSelectionStatus = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
// TC --->if female gender Button is selected then TC is pass, otherwise TC is failed
	  System.out.println("Female Radio Button Status is "+radioButtonSelectionStatus);
	  
	  Assert.assertTrue(radioButtonSelectionStatus,"Radio Button is not Selected");
	  
	  
	  
//	  if(radioButtonSelectionStatus)
//	  {
//		  System.out.println("Radio Button Status is Selected , Tc is passed");
//	  }
//	  else
//	  {
//		  System.out.println("Radio Button Status is not Selected , Tc is failed");
//	  }
  }
}
