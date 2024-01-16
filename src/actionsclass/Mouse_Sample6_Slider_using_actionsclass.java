package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Sample6_Slider_using_actionsclass {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(500);
		
		WebElement SLider = driver.findElement(By.id("slider"));
		
		Actions  act = new Actions(driver);
		act.scrollToElement(SLider).perform();
		Thread.sleep(2000);
		//act.dragAndDropBy(SLider, 30, 0).perform();
		act.dragAndDropBy(SLider, 40, 0).perform();

	}

}
