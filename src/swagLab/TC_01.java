package swagLab;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_01 {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement userPassword = driver.findElement(By.id("password"));
		WebElement logInButton = driver.findElement(By.xpath("//input[@class='btn_action']"));
		
		userName.sendKeys("standard_user");
		userPassword.sendKeys("secret_sauce");
		logInButton.click();
		
		WebElement boltTshirt = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[3]"));
		WebElement bikeLight = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[2]"));
		
		boltTshirt.click();
		bikeLight.click();
		
		WebElement cartBoxButton = driver.findElement(By.id("shopping_cart_container"));
		cartBoxButton.click();
		
		//if single element is there or multiple eac time prefer--->findElements
		List<WebElement> cartItems = driver.findElements(By.className("inventory_item_name"));
		System.out.println("No of items are "+cartItems.size());
		
		for(WebElement ci : cartItems)
		{
			System.out.println("Item is "+ci.getText());
		}
		
		//validate item is same as we want
		Iterator<WebElement> it = cartItems.iterator();
		 WebElement item1 = it.next();
		 WebElement item2 = it.next();
		
		if(item1.getText().equals("Sauce Labs Bolt T-Shirt"))
		{
			System.out.println("selected item is corrected as ==>Sauce Labs Bolt T-Shirt");
			driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();
		}
		else
		{
			System.out.println("selected item is not corrected ");
		}
		
		//put your firstname & last name & zipcode
		WebElement firstName = driver.findElement(By.id("first-name"));
		WebElement lastName = driver.findElement(By.id("last-name"));
		WebElement zipCode = driver.findElement(By.id("postal-code"));
		WebElement contnueButton = driver.findElement(By.xpath("//input[@value='CONTINUE']"));
		
		firstName.sendKeys("Prashant");
		lastName.sendKeys("Ronge");
		zipCode.sendKeys("431506");
		contnueButton.click();
		
		WebElement finishButton = driver.findElement(By.xpath("//a[text()='FINISH']"));
		finishButton.click();
		
		WebElement thankYouMsg = driver.findElement(By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']"));
	
		if(thankYouMsg.getText().equals("THANK YOU FOR YOUR ORDER"))
		{
			System.out.println("Thank you msg is displayed.....logging Out");
			driver.findElement(By.className("bm-burger-button")).click();
			WebElement logoutButton = driver.findElement(By.id("logout_sidebar_link"));
			WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(5));
			wt.until(ExpectedConditions.visibilityOf(logoutButton));
			logoutButton.click();
		}
		else
		{
			System.out.println("Thank you msg is displaying..........PLz check");
		}
		
		
		

	}

}
