package webElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Type_6_isdiplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
//		Thread.sleep(3000);
//		driver.findElement(By.id("hide-textbox")).click();

		Thread.sleep(3000);
		boolean Result1 = driver.findElement(By.name("show-hide")).isDisplayed();
		System.out.println("Displayed status is "+Result1);
		
		Thread.sleep(3000);
		driver.findElement(By.name("show-hide")).sendKeys("testing");
		
		Thread.sleep(2000);
		boolean Result2 = driver.findElement(By.name("show-hide")).isDisplayed();
		System.out.println("Displayed status is "+Result2);

	}

}
