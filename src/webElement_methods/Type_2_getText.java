package webElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Type_2_getText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		
		String expectedText = "Find your dream job now";
		String actaualText = driver.findElement(By.className("qsb-title")).getText();
		System.out.println(actaualText);
		//WebElement myelement = driver.findElement(By.className("qsb-title"));
		
		
		if(expectedText.equals(actaualText))
		{
			System.out.println("Test is matching , Testcase is pass ");
		}
		else 
		{
			System.out.println("Test is not matching , Testcase is fail ");
		}

	}

}
