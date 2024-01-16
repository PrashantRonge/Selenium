package scrolling_javscript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollin_with_javascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(1000);
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0,700)");
		Thread.sleep(1000);
		je.executeScript("window.scrollBy(0,2500)");
		Thread.sleep(1100);
		je.executeScript("window.scrollBy(0,-1500)");
		
		
		

	}

}
