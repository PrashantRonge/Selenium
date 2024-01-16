package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Sendkeys_keys_Actions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		
		WebElement bday = driver.findElement(By.id("day"));
		//bday.click();
		
		Actions act = new Actions(driver);
         
		//------------------1stway---------------------------------//
		
		act.click(bday).sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ENTER).build().perform();
		
		
		//---------------------2nd way------------------------//
//		act.click(bday).perform();
//		Thread.sleep(500);
//		for(int i = 0 ; i<=13 ; i++)
//		{
//			act.sendKeys(Keys.ARROW_UP).perform();
//			Thread.sleep(1000);
//		}
//		Thread.sleep(1000);
//		act.sendKeys(Keys.ENTER).perform();
		
		
		}

}
