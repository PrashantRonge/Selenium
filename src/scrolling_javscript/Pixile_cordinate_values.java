package scrolling_javscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pixile_cordinate_values {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(1000);
		
		WebElement elemnet = driver.findElement(By.xpath("(//div[@class=\"_3Q2wc\"])[2]"));
        
		//x-cordinate value
		System.out.println(elemnet.getLocation().x);
		
		//y-cordinate value
		System.out.println(elemnet.getLocation().y);
	}

}
