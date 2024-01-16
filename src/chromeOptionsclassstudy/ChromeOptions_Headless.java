package chromeOptionsclassstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_Headless {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op = new ChromeOptions();
		ChromeOptions headles = op.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(headles);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		Thread.sleep(1000);
		System.out.println("Title is ---> "+driver.getTitle());

	}

}
