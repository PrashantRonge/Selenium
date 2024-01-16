package example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignmentVishal {

	public static void main(String[] args) throws InterruptedException {
		
		// Step 1:nitialize the WebDriver & Open URL
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com");
		Thread.sleep(1000);
		
		 //Step 2: Click on Alert, frames and Windows
		driver.findElement(By.xpath("//div[@id=\"app\"]/div/div/div[2]/div/div[3]")).click();
		Thread.sleep(1000);
		
		// Step 3: Click on browser Windows-New windows
		driver.findElement(By.xpath("//span[text()='Browser Windows']")).click();
		Thread.sleep(2000);
		
		// Step 4: Switch to new window and print title
	    driver.findElement(By.xpath("//button[text()='New Window']"));
        String title = driver.getTitle();
		System.out.println(title);		
		Thread.sleep(500);
		
		// Step 5: Click on Alerts
		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		
		// Step 6: Click on 4th Click me button
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(1000);
		
		// Step 7: Enter your name in the prompt and verify the text
		Alert ale = driver.switchTo().alert();
		ale.getText();
		ale.sendKeys("Vishal");
		ale.accept();
		
		// Step 8: Click on Modal Dialogs -> Large modal
		driver.findElement(By.xpath("//span[text()='Modal Dialogs']")).click();
		driver.findElement(By.xpath("//button[text()='Large modal']")).click();
		
		// Step 9: Click on close button on Large modal
		driver.findElement(By.id("closeLargeModal")).click();
		
		
		
	}

}
