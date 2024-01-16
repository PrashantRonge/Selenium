package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vishal {

	public static void main(String[] args) throws InterruptedException {
		
		// Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Step 1: Open URL
            driver.get("https://demoqa.com");

            // Step 2: Click on Alert, frames and Windows
            WebElement alertFramesWindows = driver.findElement(By.xpath("//span[text()='Alerts, Frame & Windows']"));
            alertFramesWindows.click();

            // Step 3: Click on browser Windows-New windows
            WebElement newWindowButton = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
            newWindowButton.click();

            // Step 4: Switch to new window and print title
            String mainWindow = driver.getWindowHandle();
            for (String windowHandle : driver.getWindowHandles()) {
                driver.switchTo().window(windowHandle);
            }
            System.out.println("New Window Title: " + driver.getTitle());

            // Step 5: Click on Alerts
            WebElement alertsButton = driver.findElement(By.xpath("//span[text()='Alerts']"));
            alertsButton.click();

            // Step 6: Click on 4th Click me button
            WebElement fourthClickButton = driver.findElement(By.id("promptButton"));
            fourthClickButton.click();

            // Step 7: Enter your name in the prompt and verify the text
            String name = "Your Name";
            driver.switchTo().alert().sendKeys(name);
            driver.switchTo().alert().accept();
            WebElement promptResult = driver.findElement(By.id("promptResult"));
            System.out.println("Prompt Result Text: " + promptResult.getText());

            // Step 8: Click on Modal Dialogs -> Large modal
            WebElement modalDialogs = driver.findElement(By.xpath("//span[text()='Modal Dialogs']"));
            modalDialogs.click();
            WebElement largeModalButton = driver.findElement(By.id("showLargeModal"));
            largeModalButton.click();

            // Step 9: Click on close button on Large modal
            WebElement closeModalButton = driver.findElement(By.id("closeLargeModal"));
            closeModalButton.click();

        } finally {
            // Close the browser
            driver.quit();
        }
    }

	}


