package example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_WebTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingo.com/handle-static-web-table-in-selenium/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 int numOfRows = driver.findElements(By.xpath("//figure[@class='wp-block-table']//tbody/tr")).size();
		System.out.println(numOfRows);
		
	    int numOfColumns = driver.findElements(By.xpath("//figure[@class='wp-block-table']//tbody/tr[1]/th")).size();
        System.out.println(numOfColumns);
        
        for(int i = 1 ; i<=numOfRows ;i++)
		{
			for(int j = 1 ; j<=numOfColumns ; j++)
			{
				if(i==1)
				{
					 String data1 = driver.findElement(By.xpath("//figure[@class='wp-block-table']//tr["+i+"]/th["+j+"]")).getText();
					System.out.print(data1+"  ");
					
					
				}
		
				else
				{
					 String data2 = driver.findElement(By.xpath("//figure[@class='wp-block-table']//tr["+i+"]/td["+j+"]")).getText();
					System.out.print(data2+"  ");
					
				}
				
			}
			System.out.println();
		}
	}

}
