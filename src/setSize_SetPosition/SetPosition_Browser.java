package setSize_SetPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition_Browser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		//Default Position
		Point defaultposition = driver.manage().window().getPosition();
		System.out.println(defaultposition);
		
		//Desired Position (x,y)
		Point p = new Point(250, 500);
		Thread.sleep(1000);
		driver.manage().window().setPosition(p);
		
		Point p1 = new Point(-250, -500);
		Thread.sleep(1000);
		driver.manage().window().setPosition(p1);

	}

}
