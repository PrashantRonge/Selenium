package part2_Web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lec_32locatorS_Drop_down {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		Thread.sleep(500);    //--->stage1
		WebElement month = driver.findElement(By.name("birthday_month"));
		
		Thread.sleep(500);   //--->stage2
		Select s = new Select(month);
		
		Thread.sleep(2500);  //--->stage3
		s.selectByValue("7");
		
		
		

	}

}
