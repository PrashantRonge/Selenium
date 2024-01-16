package testNG_Serial_Parallel_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void amazonTest() 
  {
	  WebDriver driver = new ChromeDriver();
	  //driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/");
  }
}
