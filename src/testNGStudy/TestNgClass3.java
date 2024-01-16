package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgClass3 {
  @Test
  public void fbLaunch() 
  {
	  WebDriver  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  Reporter.log("fb launched", true);
  }
  @Test
  public void instaLanumch()
  {
	  WebDriver  driver = new ChromeDriver();
	  driver.get("https://www.instagram.com/");
	  Reporter.log("insta launched", true);
  }
  @Test
  public void twitterLaunch()
  {
	  WebDriver  driver = new ChromeDriver();
	  driver.get("https://twitter.com/");
	  Reporter.log("twitter launched", true);
  }
}
