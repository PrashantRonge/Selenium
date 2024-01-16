package chromeOptionsclassstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chomeoption_Incognito {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		ChromeOptions Incognitomode = op.addArguments("Incognito");
		
		WebDriver driver = new ChromeDriver(Incognitomode);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		Thread.sleep(1000);
		System.out.println("Title is ---> "+driver.getTitle());

	}

}
