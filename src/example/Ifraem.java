package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ifraem {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
         Thread.sleep(500);
         
        driver.switchTo().frame("google_ads_iframe_/22152718,16833175/sws-hb//w3schools.com//main_leaderboard_0");
         
         Thread.sleep(3000);
         WebElement a = driver.findElement(By.xpath("//h2[text()='My First JavaScript']"));
         System.out.println(a.getText());
         
         Thread.sleep(3000);
         driver.findElement(By.xpath("//button[@type=\"button\"]")).click();

	}

}
