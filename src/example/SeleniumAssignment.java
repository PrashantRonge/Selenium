package example;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumAssignment 
{
	 
	public static void main(String[] args) throws InterruptedException {
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Step 1: Open URL
            driver.get("https://demoqa.com");
            Thread.sleep(1000);

            // Step 2: Click on Alert, frames and Windows
            clickElement(driver, By.xpath("//span[text()='Alerts, Frame & Windows']"));

            // Step 3: Click on browser Windows-New windows
            clickElement(driver, By.xpath("//span[text()='Browser Windows']"));

            // Step 4: Switch to new window and print title
            switchToNewWindow(driver);

            // Step 5: Click on Alerts
            clickElement(driver, By.xpath("//span[text()='Alerts']"));

            // Step 6: Click on 4th Click me button
            clickElement(driver, By.xpath("//button[text()='Click me']"));

            // Step 7: Enter your name in the prompt and verify the text
            handlePromptAlert(driver, "Your Name");

            // Step 8: Click on Modal Dialogs -> Large modal
            clickElement(driver, By.xpath("//span[text()='Modal Dialogs']"));
            clickElement(driver, By.id("showLargeModal"));

            // Step 9: Click on close button on Large modal
            clickElement(driver, By.id("closeLargeModal"));

        } finally {
            // Close the browser
            driver.quit();
        }
    }

    private static void clickElement(WebDriver driver, By locator) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    private static void switchToNewWindow(WebDriver driver) {
        String mainWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window);
                System.out.println("New Window Title: " + driver.getTitle());
                break;
            }
        }
    }

    private static void handlePromptAlert(WebDriver driver, String inputText)
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
       // WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());
        org.openqa.selenium.Alert alert = driver.switchTo().alert();
        alert.sendKeys(inputText);
        alert.accept();
        WebElement promptResult = driver.findElement(By.id("promptResult"));
        System.out.println("Prompt Result Text: " + promptResult.getText());
    }
}