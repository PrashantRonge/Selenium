package popup_study;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow_Popup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		
		//GettingText of MainPage
		WebElement mainPageText = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
		System.out.println(mainPageText.getText());
		
		//Clicking On New Window
		Thread.sleep(1000);
		driver.findElement(By.name("NewWindow")).click();
		
		//driver.close();  // Close Current Tab
		//driver.quit();   // Close All Tab
		
		String mainpPageID = driver.getWindowHandle();
		System.out.println("Mainpage id is --> "+mainpPageID);
		
		
		Thread.sleep(1000);
		Set<String> allWindowId = driver.getWindowHandles();
		Iterator<String> ite = allWindowId.iterator();
		String mainWindowId = ite.next();
		System.out.println("main window id is ---> "+mainWindowId);
		String child1Id = ite.next();
		System.out.println("child window id id --->"+child1Id);
		
		//To switch foucus on child page Id from Mainpage we know id 
		driver.switchTo().window(child1Id);
		driver.manage().window().maximize();
		Thread.sleep(2500);
		//driver.close(); --->NoSuchWindowException:
		driver.findElement(By.id("the7-search")).sendKeys("Good MOrning");
		
		driver.switchTo().window(mainpPageID);
		Thread.sleep(2500);
		
		 String text = driver.findElement(By.xpath("//p[contains(text(),'in new tab')]")).getText();
		 System.out.println(text);
		
	}

}
