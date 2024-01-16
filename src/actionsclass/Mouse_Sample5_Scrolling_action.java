package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Sample5_Scrolling_action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		
		WebElement Sunday = driver.findElement(By.id("sunday"));
		
		WebElement Monday = driver.findElement(By.id("monday"));
		
		WebElement Tuesday = driver.findElement(By.id("tuesday"));
		
		Actions act = new Actions(driver);
		act.scrollToElement(Tuesday).perform();
//		Thread.sleep(2000);
//		act.click(Sunday).perform();
//		act.click(Monday).perform();
//		act.click(Tuesday).perform();
	}

}
