package cross_Browser_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBTesting 
{
  @Parameters("bname")
  @Test
  public void test1(String BrowserName) throws InterruptedException
  {
	  WebDriver driver = null ;
	  
	if(BrowserName.equals("Chrome"))
	  {
	   driver = new ChromeDriver();
	  }
	  else if(BrowserName.equals("Firefox"))
	  {
	   driver = new FirefoxDriver();
	  }
	  
	  
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
