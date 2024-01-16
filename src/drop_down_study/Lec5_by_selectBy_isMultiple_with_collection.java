package drop_down_study;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lec5_by_selectBy_isMultiple_with_collection {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement dropdwon = driver.findElement(By.id("cars"));
		Thread.sleep(500);
		
		Select s1 = new Select(dropdwon);
		System.out.println(s1.isMultiple());
		s1.selectByIndex(0);
		Thread.sleep(500);
		s1.selectByValue("opel");
		Thread.sleep(500);
		s1.selectByVisibleText("Audi");
		
		System.out.println("==========getFirstSelectedOption=============");
		s1.getFirstSelectedOption().getText();
		System.out.println(s1.getFirstSelectedOption().getText());
		
//getOptions()
		
		System.out.println("---------------Select.getOptions-----------------");
		List<WebElement> options = s1.getOptions();  //-->we cant use get() bcoz it works
                                                     // on webelemnts not on list of webelemts
		System.out.println(options);  
		              
		System.out.println("================for==================");
		for(int i= 0 ; i<= options.size()-1 ; i++ )
		{
			System.out.println(options.get(i).getText());
		}
		
		System.out.println("==============for-each================");
		for(WebElement foroptions :options)
		{
			System.out.println(foroptions.getText());
		}
		
		System.out.println("==========iterator=============");
		
		Iterator<WebElement> iteratoroptions = options.iterator();
		while(iteratoroptions.hasNext())
		{
			System.out.println(iteratoroptions.next().getText());
		}
		
		System.out.println("==========list-iterator=============");
		
		ListIterator<WebElement> listiteratoroptions = options.listIterator();
		
		while(listiteratoroptions.hasNext())
		{
			System.out.println(listiteratoroptions.next().getText());
		}
		
		
		System.out.println("***********************************");
		System.out.println("***********************************");
		
		
		
//getAllSelectedOptions		
		System.out.println("----------------getAllSelectedOptions-----------------");
		List<WebElement> optionselected = s1.getAllSelectedOptions();
		
		System.out.println("=========foreach==========");
		for(WebElement forechslected:optionselected)
		{
			System.out.println(forechslected.getText());
		}
		
		System.out.println("===========for=============");
		for(int j=0 ; j<=optionselected.size()-1 ; j++)
		{
			System.out.println(optionselected.get(j).getText());
		}
		
		System.out.println("===========iterator=============");
		Iterator<WebElement> iteratorslected = optionselected.iterator();
		while(iteratorslected.hasNext())
		{
			System.out.println(iteratorslected.next().getText());
		}

		System.out.println("===========li-iterator=============");
		
		ListIterator<WebElement> listiteratorslected = optionselected.listIterator();
		while(listiteratorslected.hasNext())
		{
			System.out.println(listiteratorslected.next().getText());
		}
	}

}
