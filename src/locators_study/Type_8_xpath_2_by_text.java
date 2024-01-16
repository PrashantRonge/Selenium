package locators_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Type_8_xpath_2_by_text {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver()	;
		driver.get("https://www.oyorooms.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//h2[text()='Bangalore']")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[text()='Login / Signup']")).click();
		

	}

}
