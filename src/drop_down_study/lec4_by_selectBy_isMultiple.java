package drop_down_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
// for manual checking we use ctrl + click
// tagname should be secet

public class lec4_by_selectBy_isMultiple {

	public static void main(String[] args)  {
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
//		driver.manage().window().maximize();
//		Thread.sleep(500);
//		
//		WebElement dropdown = driver.findElement(By.name("selenium_commands"));
//		Thread.sleep(1000);
//		
//		Select  ms = new Select(dropdown);
//		System.out.println("is multiselected "+ms.isMultiple());
//		
//		Thread.sleep(500);
//		ms.selectByVisibleText("Switch Commands");
//		
//		Thread.sleep(500);
//		ms.selectByIndex(4);
//		
//		Thread.sleep(500);
//		ms.selectByVisibleText("Wait Commands");
//		
//		Thread.sleep(500);
//		ms.deselectByIndex(4);
//		
//		Thread.sleep(500);
//		ms.deselectAll();
//		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
	//	Thread.sleep(500);
		
		WebElement dropdown = driver.findElement(By.name("cars"));
	//	Thread.sleep(500);
		
		Select c1 = new Select(dropdown);
		System.out.println(c1.isMultiple());
		
		//Thread.sleep(500);
		c1.selectByIndex(3);
		
		//Thread.sleep(500);
		c1.selectByValue("opel");
		
		//Thread.sleep(500);
		c1.selectByVisibleText("Saab");
		
		//Thread.sleep(500);
		c1.selectByIndex(0);
		
		//Thread.sleep(500);
		c1.deselectByValue("opel");
		
		//Thread.sleep(3000);
		 c1.deselectAll();
		
		
	}

}
