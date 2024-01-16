package webTable_study;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleNo_6 {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("BookTable"));
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		//no. of rows
		System.out.println("=================================================================================");
		System.out.println("Number of Rows = "+rows.size());
		System.out.println("=================================================================================");
		//no. of columns
		List<WebElement> columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
		System.out.println("Number of Columns = "+columns.size());
		System.out.println("=================================================================================");
		List<WebElement> row1 = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//td"));
		WebElement text = driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/th[1]"));
		System.out.println(text.getText());
		//print 1 row
		System.out.println("=================================================================================");
		System.out.println("Print one Row");
		System.out.println("=================================================================================");
		List<WebElement> row2 = driver.findElements(By.xpath("//table[@name='BookTable']//tr[2]/td"));
		for(int i=0;i<row2.size();i++)
		{
			System.out.print(" "+row2.get(i).getText());
		}
//		System.out.println("=================================================================================");
		//print one column
		System.out.println();
		System.out.println("=================================================================================");
		System.out.println("Print one Column");
		System.out.println("=================================================================================");
		List<WebElement> col2 = driver.findElements(By.xpath("//table[@name='BookTable']//tr/td[1]"));
		for(int i=0;i<col2.size();i++)
		{
			System.out.println(" "+col2.get(i).getText());
		}
		System.out.println("=================================================================================");
		//print  whole table
		for(int i =1;i<=rows.size();i++)
		{
			for(int j=1;j<=columns.size();j++)
			{
				if(i==1)
				{
					WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/th["+j+"]"));
					System.out.printf("%20s",data.getText());
				}
				else
				{
					WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]"));
					System.out.printf("%20s",data.getText());
				}
			}
			System.out.println();
			System.out.println("=================================================================================");
				
		}
		
		

	}

}
