package take_screens_hot_1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Lec_3_SS_Single_specificElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(500);
		
		WebElement pixles = driver.findElement(By.xpath("//div[text()='TRENDING OFFERS']"));
        File src = pixles.getScreenshotAs(OutputType.FILE);
        File dest = new File("D:\\selenium\\screenshot_permanat\\single.png");
        FileHandler.copy(src, dest);
	}

}
