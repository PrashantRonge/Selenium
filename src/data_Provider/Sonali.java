package data_Provider;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import org.testng.annotations.Test;

public class Sonali {
	
	



	  
	  @Test (dataProvider = "FbRgression", dataProviderClass = FB_Data_Provider.class)
	  
	  public void Details(String firstName, String lastName, String mobNum) throws InterruptedException
	  {
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.name("firstname")).sendKeys(firstName);
		  driver.findElement(By.name("lastname")).sendKeys(lastName);
		  driver.findElement(By.name("reg_email__")).sendKeys(mobNum);
		  
		  
	  }
	
	
	
	
	
}

