package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MAnisj {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uat-app.skillsurvey.com/Reference/Candidate/SampleSurvey?programId=aMCj8MlaPvtqsRIb23BiSg%3D%3D&companyId=6h4JMaqM5JT0wii4otoQCg%3D%3D&divisionId=tXmrmZBE4EFHQxsrLx0mFQ%3D%3D&profileTypeId=1");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("(//fieldset/div/ul/li[8])[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("(//fieldset/div/ul/li[8])[2]")).click();
        
	}

}
