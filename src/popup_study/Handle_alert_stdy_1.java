package popup_study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_alert_stdy_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		Thread.sleep(1000);
		Alert ale = driver.switchTo().alert();
		ale.getText();		
		System.out.println(ale.getText());
		
		Thread.sleep(1000);
		ale.dismiss();
		
		Thread.sleep(1000);
		driver.findElement(By.name("cusid")).sendKeys("Prashant");
		
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@type=\"reset\"]")).click();
		

	}

}
