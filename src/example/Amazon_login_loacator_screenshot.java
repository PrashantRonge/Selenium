package example;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Amazon_login_loacator_screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@maxlength=\"128\"]")).sendKeys("917507789497");
		
	    Thread.sleep(2000);
		driver.findElement(By.className("a-button-input")).click();
		
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@maxlength=\"1024\"]")).sendKeys("Prashant@12");
 
	    Thread.sleep(2000);
	    driver.findElement(By.id("signInSubmit")).click();
	    
	    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    
	    RandomString a = new RandomString();
	    String rs = a.make(2);
	    
	    Thread.sleep(2000);
	    File myfile = new File("D:\\selenium\\screenshot_permanat\\amzon"+rs+".png");
	
	    Thread.sleep(2000);
	    FileHandler.copy(src, myfile);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id=\"nav-cart\"]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name=\"submit.addToCart\"])[5]")).click();
	}

}
