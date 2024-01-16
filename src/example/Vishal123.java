package example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vishal123 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com");
		Thread.sleep(3000);
		
		 //Step 2: Click on Alert, frames and Windows
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		
		//----------------------------------------
//		WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demoqa.com");
//		Thread.sleep(3000);
//		
//        // Step 2: Click on Alert, frames and Windows
//        clickElement(driver, By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]"));
//
//        // Step 3: Wait for overlapping element to be hidden or moved
//        waitForElementToBeClickable(driver, By.xpath("//span[text()='Alerts']"));
//
//        // Step 4: Click on Alerts
//        clickElement(driver, By.xpath("//span[text()='Alerts']"));

//	}
//	private static void clickElement(WebDriver driver, By locator) {
//        WebElement element = waitForElementToBeClickable(driver, locator);
//        element.click();
//    }
//
//    private static WebElement waitForElementToBeClickable(WebDriver driver, By locator) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        return wait.until(ExpectedConditions.elementToBeClickable(locator));
//    }

}
}
