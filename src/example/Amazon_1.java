package example;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id=\"nav-hamburger-menu\"]")).click();
		
		
//		Thread.sleep(3000);
//		Select s1 = new Select(dropdown);
//		s1.selectByValue("All Mobile Accessories");
		
		//driver.findElement(By.xpath("//a[text()='All Mobile Phones']"));
		
	}

}
