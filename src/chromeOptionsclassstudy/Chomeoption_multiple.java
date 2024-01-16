package chromeOptionsclassstudy;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chomeoption_multiple {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions multipleop = new ChromeOptions();
		
		ArrayList<String> ali = new ArrayList<>();
		ali.add("Incognito");
		ali.add("start-maximized");
		ali.add("-disable-notifications");
		
		ChromeOptions mltop = multipleop.addArguments(ali);
		
		WebDriver driver = new ChromeDriver(mltop);
		driver.get("https://www.ajio.com/");
		Thread.sleep(2000);
		System.out.println("Title is ---> "+driver.getTitle());

	}

}
