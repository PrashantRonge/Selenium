package locators_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Type_8_xpath_1_by_attribute {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).sendKeys("Prashant");

		Thread.sleep(500);
		driver.findElement(By.xpath("//input[contains(@id,'u_0_d')]")).sendKeys("Ronge");
		

	}

}

//WebDriver driver=new ChromeDriver();
//driver.get("https://www.facebook.com/");
//
//Thread.sleep(500);
//driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]")).click();
