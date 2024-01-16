package webElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Type_5_isselected {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		Thread.sleep(3000);
		
		WebElement status = driver.findElement(By.xpath("(//input[contains(@id,'u_')])[7]"));
        boolean result = status.isSelected();
        System.out.println("radio button status is  before click "+result);
        Thread.sleep(1000);
        
        status.click();
        boolean result1 = status.isSelected();
        System.out.println("radio button status is after click "+result1);

	}

}
