package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_ex1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(2000);
		//swithing focus from main source to iframe
		
		driver.switchTo().frame("singleframe");
		Thread.sleep(2000);
		String mystring = driver.findElement(By.xpath("//h5[text()='iFrame Demo']")).getText();
        System.out.println(mystring);
		
        //switching to main page
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        
        Thread.sleep(2000);
       WebElement button2 = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
       System.out.println(button2.isDisplayed());

	}

}
