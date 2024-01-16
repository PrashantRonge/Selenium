package drop_down_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lec3_by_selectByVisibleText {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(500);
	
		WebElement byear = driver.findElement(By.name("birthday_year"));
		Thread.sleep(500);
		
		Select syear = new Select(byear);
		syear.selectByVisibleText("1996");
	}

}
