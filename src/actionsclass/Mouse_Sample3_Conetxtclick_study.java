package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Sample3_Conetxtclick_study {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions act = new Actions(driver);
		//1st way
//		act.moveToElement(rightClick).contextClick().build().perform();
		
		//2nd way
//		act.moveToElement(rightClick).perform();
//		act.contextClick().perform();
	
		//3rd Way
		act.contextClick(rightClick).perform();
		
	}

}
