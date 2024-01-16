package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Sample2_Double_click_study {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me')]"));
		
		//1st way
		Actions act = new Actions(driver);
//		act.moveToElement(doubleclick).doubleClick().build().perform();
        
		//2nd way 
//		act.moveToElement(doubleclick).perform();
//		act.doubleClick().perform();
		
		//3rd way
		act.doubleClick(doubleclick).perform();
	}

}
