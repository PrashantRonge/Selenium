package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Sample4_Drag_drop_use {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement destination = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		
		//1st way
//		act.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();
		
		//2nd way
		act.clickAndHold(source).release(destination).build().perform();
		
	
		//3rd way
		act.dragAndDrop(source ,destination).perform();
		
	}

}
