package webTable_study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleNo_5 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		int numOfRows = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		int numOfColumns = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]/th")).size();
		for(int a = 1 ; a<=numOfColumns ; a++) 
		{
			Object headers = driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr/th["+a+"]")).getText();
			System.out.print(headers+"  ");
		}
		System.out.println();
		System.out.println("===========================================");

		for(int b = 1 ; b<=numOfRows-1 ; b++)
		{
			for(int c = 1 ; c<=numOfColumns ; c++)
			{
				Object tableDatad = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+b+"]/td["+c+"]")).getText();
				System.out.print(tableDatad+"  ");
			}
			System.out.println();
			System.out.println("============================================");
		}
		
	}

}
