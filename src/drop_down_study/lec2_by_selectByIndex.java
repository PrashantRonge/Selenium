package drop_down_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lec2_by_selectByIndex {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		

		//-----------dropdown by select index------------------//
		
		WebElement bmonth = driver.findElement(By.name("birthday_month"));    
		Thread.sleep(500);
		
		Select smonth = new Select(bmonth);    
		smonth.selectByIndex(6);                 
		
		
	}

}
