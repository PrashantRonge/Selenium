package example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_WebTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//1.Single Header
System.out.println("--------------------Single Header--------------------");		
	    WebElement heder3 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/th[3]"));
        System.out.println(heder3.getText());
 
System.out.println("----------------------Single Row----------------------");       
//2.Single Row (All Headers)
        List<WebElement> allHeaders = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
	    for(WebElement head :allHeaders)
	    {
	    	System.out.print(head.getText()+"    ");
	    }
	    System.out.println();
	    
System.out.println("--------------------Single Column--------------------");	    
//3.Single Column
	    for(int i =2; i<=7 ;i++ )
	    {
	    	WebElement single = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[3]"));
	    	System.out.print(single.getText()+"    ");
	    	
	    }
	    System.out.println();
	    
System.out.println("----------------Whole Table Hardcoding----------------");	    
//4.Whole Table Hardcoding
        for(int i=1 ; i<=7 ; i++)
	    {
	    	for(int j=1;j<=4;j++)
	    	{
	    		if(i==1)
	    		{
	    		         WebElement hed3 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/th["+j+"]"));
	    		          System.out.print(hed3.getText()+"        ");
	    		          
	    		}
	    		else 
	    		{
	    			WebElement hed31 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]"));
	    			System.out.print(hed31.getText()+"     ");
	    		}
	    	}
	    	System.out.println();
	    	System.out.println("===================================");
	    }
	    
System.out.println("----------------Whole Table Automaed----------------");
//Whole Table Automated 
	          int totalrows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	          int totalcolumns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th")).size();
	          for(int j = 1 ; j<=totalrows; j++)
	          {
	          	for(int k = 1 ; k<=totalcolumns ; k++)
	          	{
	          		if(j==1)
	          		{
	          			String head4 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+j+"]/th["+k+"]")).getText();
	          			System.out.print(head4+"    ");
	          		}
	          		else
	          		{
	          			String head41 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+j+"]/td["+k+"]")).getText();
	          			System.out.print(head41+"   ");
	          		}
	          	}
	          	System.out.println();
	          	System.out.println("================+++++====================");
	          }
	  }

}
