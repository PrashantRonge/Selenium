package miscellaneous;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_ScrollIntoView {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(500);
		
		WebElement allCompany = driver.findElement(By.xpath("//a[@class='view-all-comp']"));

		CommonlyUsedMethodS.scrollInView(driver, allCompany);
		CommonlyUsedMethodS.takeScreenshot(driver, "allcompany");
	}

}
