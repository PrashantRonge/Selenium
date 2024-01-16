package locators_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Type_8_xpath_4_by_index {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();


	}

}

//WebDriver driver= new ChromeDriver();
//driver.get("https://www.redbus.in/");
//Thread.sleep(500);
//driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Pathri (Parbhani)");
//Thread.sleep(500);
//driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Pune");
//Thread.sleep(500);
//driver.findElement(By.xpath("//span[text()='Date']")).click();
//

