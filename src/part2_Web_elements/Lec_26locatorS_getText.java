package part2_Web_elements;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lec_26locatorS_getText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://sensibull.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		String expetctedReslt = "Trade Options like a Pro";
		String actualResult = driver.findElement(By.xpath("(//h1[contains(text(),'Trade Options')])[1]")).getText();
		System.out.println(actualResult);
		
		if(actualResult.equals(expetctedReslt))
		{
			System.out.println("Text is matching , Test is passed");
		}
		else
		{
			System.out.println("Text is not matching , Test is failed");

		}
	}

}
