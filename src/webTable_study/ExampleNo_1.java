package webTable_study;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleNo_1 {

	public static void main(String[] args) {
		
//Idebtify WebTable		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement table1 = driver.findElement(By.name("BookTable"));
		
// How many rows identification		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		int numofrows = rows.size();
		System.out.println(numofrows);

// How many Columns There
		List<WebElement> headers = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th"));
		int noOfheaders = headers.size();
		System.out.println(noOfheaders);
		
	}

}
