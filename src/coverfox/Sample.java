package coverfox;

import java.time.Duration;
import java.util.List;

import org.apache.commons.io.file.CopyDirectoryVisitor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//page1
		driver.findElement(By.xpath("//button[text()='Get Started']")).click();
		//page2
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='next-btn']")).click();
		//page3
		WebElement ageDropdown = driver.findElement(By.id("Age-You"));
		Select s = new Select(ageDropdown);
		s.selectByValue("27y");
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		//page4
		driver.findElement(By.xpath("//input[@placeholder='6 Digit Pincode']")).sendKeys("431506");
		driver.findElement(By.xpath("//input[@placeholder='Your mobile number']")).sendKeys("7507789497");
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		//page5
		
		List<WebElement> listOfInsurances = driver.findElements(By.id("plans-list"));
		int totalSujjestedPlans = listOfInsurances.size();
		System.out.println(listOfInsurances.size());
		 String matchingplan = driver.findElement(By.xpath("//div[contains(text(),'49 matching Health')]")).getText();
		System.out.println(matchingplan);
	      String[] result = matchingplan.split(" ");
		
		 String matchingNumberInString = result[0];
		 
		 int matchingNumberInInteger = Integer.parseInt(matchingNumberInString);
		 if(totalSujjestedPlans==matchingNumberInInteger)
		 {
			 System.out.println("plans no is matching is sujjested plans");
		 }
		 else
		 {
			 System.out.println("plans no is matching is not sujjested plans");
		 }
		 
		 driver.findElement(By.xpath("//div[@class=\"type-check\"]//div[@class=\"fc-filter-val\"]")).click();
		 driver.findElement(By.xpath("(//i[@class='icon-checkbox icon-checkbox-blue'])[1]")).click();
		

	}

}
