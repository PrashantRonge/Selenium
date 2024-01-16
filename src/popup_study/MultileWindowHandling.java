package popup_study;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultileWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title=\"Remote\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title=\"MNC\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title=\"Marketing\"]")).click();
		
		Set<String> allwin = driver.getWindowHandles();
		ArrayList<String> liWin = new ArrayList<String>(allwin);
		
		for(int i = 0 ; i<liWin.size() ; i++)
		{
			Thread.sleep(2000);
			driver.switchTo().window(liWin.get(i));
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();
			
		}

	}

}
