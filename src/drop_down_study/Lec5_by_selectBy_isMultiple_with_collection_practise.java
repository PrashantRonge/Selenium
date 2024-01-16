package drop_down_study;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lec5_by_selectBy_isMultiple_with_collection_practise {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		 
		 Thread.sleep(2000);
		 WebElement bmonth = driver.findElement(By.id("month"));
		 
		 Thread.sleep(1000);
		 Select s1=new Select(bmonth);
		 s1.selectByValue("12");
		 
		 List<WebElement> Moptions = s1.getOptions();
		 System.out.println("=====================for loop===============================");
		 //1)for loop
		 for(int i=0;i<=Moptions.size()-1;i++)
		 {
			 System.out.println(Moptions.get(i).getText());
			 
		 }
		 
		 
		 System.out.println("=====================for each loop===============================");
		 for(WebElement foreachop:Moptions)
		 {
			 System.out.println(foreachop.getText());
		 }
		 
		 
        System.out.println("======================iterator==============================");
        
         Iterator<WebElement> itop = Moptions.iterator();
        while(itop.hasNext())
        {
        System.out.println(itop.next().getText());
        }
        
       	 
        System.out.println("=====================list_iterator===============================");
        
        ListIterator<WebElement> listop = Moptions.listIterator();
        while(listop.hasNext())
        {
       	 System.out.println(listop.next().getText());
        }
		
	}

}
