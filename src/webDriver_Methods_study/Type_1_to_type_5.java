package webDriver_Methods_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Type_1_to_type_5 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(500);
	//driver.manage().window().minimize();
	//driver.close();	---->close the current tab
	//driver.quit();     // ---->close all the tabs
	driver.navigate().to("https://www.amazon.in/");
	Thread.sleep(500);
	driver.navigate().back();
	Thread.sleep(500);
	driver.navigate().forward();
	Thread.sleep(500);
	driver.navigate().refresh();
	Thread.sleep(500);
	driver.quit();
	
	
	}

}
//get("");
//quit();
//driver.manage().window().maximize();
//driver.manage().window().minimize();
//close();
//navigate().to();
//navigate().back();
//navigate().forward();
//navigate().refresh();