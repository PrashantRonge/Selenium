package webElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Type_4_isEnable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		driver.findElement(By.id("mobileNumber")).sendKeys("9999999999");
		Thread.sleep(500);
		
		WebElement obj = driver.findElement(By.xpath("//button[text()='Get OTP']"));
//		obj.isEnabled();
		System.out.println("Get Otp button status is "+obj.isEnabled());
		Thread.sleep(3000);
		obj.click();
		
//		-------------by another way----------		
//		boolean Result = driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();
//		System.out.println("Get Otp button status is "+Result)

	}

}
