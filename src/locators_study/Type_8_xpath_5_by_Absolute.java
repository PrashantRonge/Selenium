package locators_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Type_8_xpath_5_by_Absolute {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/");
		
		Thread.sleep(500);		
		WebElement obj = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/p[1]"));
        System.out.println("my tex is "+obj.getText());

	}

}
