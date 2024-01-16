package popup_study;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab_popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewTab")).click();
		
		Set<String> alltab = driver.getWindowHandles();
		Iterator<String> ite = alltab.iterator();
		String tab1 = ite.next();
		String tab2 = ite.next();
		
		driver.switchTo().window(tab2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Watch free courses']")).click();
		
		driver.switchTo().window(tab1);
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();		
		
		

	}

}
