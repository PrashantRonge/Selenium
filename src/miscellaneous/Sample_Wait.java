package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Wait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://discoveryplus.in/");
		CommonlyUsedMethodS.implicitWait(driver, 10);
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();

	}

}
