package locators_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lec4_by_selectBy_css {

	public static void main(String[] args) throws InterruptedException  
	{
		WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");	
        driver.manage().window().maximize();
        
        
        Thread.sleep(2000);
       driver.findElement(By.cssSelector("input#firstName")).sendKeys("Prashant");
       
       Thread.sleep(2000);
       driver.findElement(By.cssSelector("input[placeholder=\"Last Name\"]")).sendKeys("ronge");
       
       Thread.sleep(500);
       driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("Pathri");
       

       Thread.sleep(500);
       driver.findElement(By.cssSelector("input.form-control[id=dateOfBirthInput]")).click();
        
       
		}

}
