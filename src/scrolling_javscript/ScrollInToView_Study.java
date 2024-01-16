package scrolling_javscript;
import java.io.File;
import java.io.IOException;

//---##-notes=(https://www.guru99.com/execute-javascript-selenium-webdriver.html)
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollInToView_Study {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		
		WebElement sponsoredCompanies = driver.findElement(By.xpath("//h2[text()='Sponsored companies']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",sponsoredCompanies);
        Thread.sleep(2000);
        
        WebElement topCompanies = driver.findElement(By.xpath("//h2[text()='Top companies hiring now']"));
        js.executeScript("arguments[0].scrollIntoView();", topCompanies);
        
       File src = topCompanies.getScreenshotAs(OutputType.FILE);
       File dest = new File("D:\\selenium\\screenshot_permanat\\singl123.png");
       FileHandler.copy(src, dest);
 	}

}
