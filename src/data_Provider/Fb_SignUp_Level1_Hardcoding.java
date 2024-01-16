package data_Provider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fb_SignUp_Level1_Hardcoding {
  @Test
  public void f() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(500);
	  
	  driver.findElement(By.linkText("Create new account")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  driver.findElement(By.name("firstname")).sendKeys("Prashant");
	  driver.findElement(By.name("lastname")).sendKeys("Ronge");
	  driver.findElement(By.name("reg_email__")).sendKeys("7507789497");
	  Thread.sleep(5000);
	  driver.close();
  }
}
