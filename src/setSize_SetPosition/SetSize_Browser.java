package setSize_SetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize_Browser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		//Default Size
		Dimension defalutsize = driver.manage().window().getSize();
		System.out.println(defalutsize);
		Thread.sleep(1000);
		//Desired size  (x,y)
		Dimension d = new Dimension(500, 500);
		driver.manage().window().setSize(d);

	}

}
