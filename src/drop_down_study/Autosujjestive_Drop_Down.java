package drop_down_study;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Autosujjestive_Drop_Down {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions op =  new ChromeOptions();
		ChromeOptions noti = op.addArguments("-disable-notifications");
		
		WebDriver driver = new ChromeDriver(noti);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		
//		WebElement Source = driver.findElement(By.xpath("//label[text()='From']"));
//		Thread.sleep(2000);
//		Source.sendKeys("Pathri");
	   // Actions act = new Actions(driver);
	    

	}

}
