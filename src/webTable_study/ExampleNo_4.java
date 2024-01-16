package webTable_study;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleNo_4 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		int noOfRows = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
		int noOfColu = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr[1]/th")).size();

	
		for(int i = 1 ; i<=noOfRows ;i++)
		{
			for(int j = 1 ; j<=noOfColu ; j++)
			{
				if(i==1)
				{
					 String data1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/th["+j+"]")).getText();
					System.out.print(data1+"  ");
					
					
				}
		
				else
				{
					 String data2 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]")).getText();
					System.out.print(data2+"  ");
					
				}
				
			}
			System.out.println();
		}
		

	}

}
