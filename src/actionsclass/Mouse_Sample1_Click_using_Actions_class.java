package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Sample1_Click_using_Actions_class {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		
		WebElement signup = driver.findElement(By.xpath("//span[text()='Sign up']"));
		
		Actions act = new Actions(driver);
		//1st way
//		act.moveToElement(signup).perform();
//		act.click().perform();
		
		//2nd way
//		act.moveToElement(signup).click().build().perform();
		
		//3rd way
		act.click(signup).perform();
		
		
		
		
		
//		WebDriver driver =  new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(500);
//		
//		//create an obj of actions class which will accept driver obj as parameter
//		WebElement login = driver.findElement(By.name("login"));
//        
//		Actions act = new Actions(driver);
//		
//		// Using Actions class method perform actions
//		act.moveToElement(login).perform();
//		act.click().perform();
		
		
	}

}
