package webTable_study;

import java.time.Duration;
import java.util.List;

import org.apache.commons.compress.harmony.unpack200.AttrDefinitionBands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleNo_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 WebElement text = driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/th[2]"));
//Only one Header name Readng
		System.out.println(text.getText());
		
// All Headers Name Reading
		List<WebElement> tableHeaders = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
		System.out.println("==============================");
		for(WebElement all:tableHeaders)   // also call ENHANCED FOR LOOP
		{
			System.out.print(all.getText()+"    ");
		}
		System.out.println();
		System.out.println("==============================");
		
		String singleElement = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]/td[3]")).getText();
		System.out.println(singleElement);
		
		System.out.println("==============================");

// How to read complite Row
		
	    List<WebElement> row3 = driver.findElements(By.xpath("//table[@name='BookTable']//tr[3]/td"));
		for(WebElement tdr3:row3)
		{
			System.out.print(tdr3.getText()+"  ");
		}
		System.out.println("=============================");
// How to read Complite column
		
		for(int i =2 ; i<=7 ; i++)
		{
			WebElement datarow = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[4]"));
			System.out.println(datarow.getText());
		}
		
		
		
		
		
		
	}

}
