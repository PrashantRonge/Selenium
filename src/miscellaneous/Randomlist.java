package miscellaneous;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Randomlist {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/webhp");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("Honda");
	
		Thread.sleep(1000);
		List<WebElement> SearchResult = driver.findElements(By.xpath("//div[@jsname=\"erkvQe\"]/div/ul/li"));
		// The <ul> tag defines an unordered (bulleted) list. Use the <ul> tag together with the <li> tag
		//to create unordered lists
		
		//The <li> tag defines a list item. The <li> tag is used inside ordered lists(<ol>), unordered lists (<ul>),
		//and in menu lists (<menu>). In <ul> and <menu>, the list items will usually be displayed with bullet points.
		
		Thread.sleep(1000);
		
   System.out.println("==============foreach=================");
		
		for(WebElement feach : SearchResult)
		{
			System.out.println(feach.getText());
		}
		
		String expectedResul = "honda elevate";
		for(WebElement feach1 : SearchResult)
		{
			String actalResl = feach1.getText();
			if(actalResl.equals(expectedResul))
			{
				feach1.click();
				break;
			}
		
		}
		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[@data-hveid=\"CAMQAw\"]")).click();
//   System.out.println("==============for loop=================");
//	
//	    for(int i=0 ; i<= SearchResult.size()-1 ; i++)
//	    {
//	     
//	    	System.out.println(SearchResult.get(i).getText());
//	    }
//	
//	    
//   System.out.println("===========iterator====================");
//   
//   
//        Iterator<WebElement> ite = SearchResult.iterator();
//        while(ite.hasNext())
//        {
//        	System.out.println(ite.next().getText());
//        }
//	System.out.println("===============list iterator================");
//		
//	
//	    ListIterator<WebElement> lite = SearchResult.listIterator();
//	    while(lite.hasNext())
//	    {
//	    	System.out.println(lite.next().getText());
//	    }
//		
		
		
		
		
		
		
		
		
		
		
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
//		
//		Thread.sleep(1000);
//		
//		driver.findElement(By.name("q")).sendKeys("honda");
//		
//		Thread.sleep(800);
//		List<WebElement> searchresult = driver.findElements(By.xpath("//div[@class='erkvQe']/div/ul/li"));
//		
//		for(WebElement rs:searchresult) 
//		{
//			System.out.println(rs.getText());
//			
//		}
	}

}
