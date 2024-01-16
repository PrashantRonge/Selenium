package synchronization;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class FluentWait_study {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://auth.discoveryplus.in/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	
	driver.findElement(By.xpath("//*[@name=\"mobileNumber\"]")).sendKeys("7507789497");
	
	WebElement getOtp = driver.findElement(By.xpath("//button[text()='Get OTP']"));
	Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
	w.until(ExpectedConditions.elementToBeClickable(getOtp));
	
	getOtp.click();
	
	
	
	
	
	

	}

}
