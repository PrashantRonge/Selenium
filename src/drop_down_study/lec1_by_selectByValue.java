package drop_down_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lec1_by_selectByValue {

	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
	
		//-----------dropdown by select value------------------//
		Thread.sleep(1000);
		WebElement bday = driver.findElement(By.id("day"));
		Thread.sleep(500);
		
		Select sday = new Select(bday);
		sday.selectByValue("18");
		Thread.sleep(500);
	}

}
