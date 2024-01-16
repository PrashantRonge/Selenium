package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_ex2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		
		Thread.sleep(1000);
		String mainpagetext = driver.findElement(By.xpath("//span[contains(text(),'Not a Friendly Topic')]")).getText();
		System.out.println("main page text is --->"+mainpagetext);
		
		Thread.sleep(1000);
		//switching focatous from mainpage to outeriframe
		driver.switchTo().frame("frame1");
		//writing in textbox present in outer iframe
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Prashant");
		
		Thread.sleep(1000);
		//switching focus from outer iframe to inner iframe
		driver.switchTo().frame("frame3");
		//cheching chech box present in innerframe
		driver.findElement(By.id("a")).click();		
	}

}
