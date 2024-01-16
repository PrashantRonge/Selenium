package locators_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Type_6_partialLinkText {

	public static void main(String[] args) throws InterruptedException   {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		
		driver.findElement(By.partialLinkText("Create new")).click();

	}

}
