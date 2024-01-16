package take_screens_hot_1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Lec_1_SS_rplacing_old_by_new {

	public static void main(String[] args) throws InterruptedException, IOException    {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bcci.tv/");
		
		Thread.sleep(500);
		// typecasting for getssas() of takesscreemshot interface
		File SRC = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(SRC);
		
		// ss with same name so only rplacing prevoius by new one
		 File DEST = new File("D:\\selenium\\selenium_ss\\MYSCREENSHOT.png"); 
		 
		 FileHandler.copy(SRC, DEST);   //--use selenium file handler
		                                //1.we require it to handle the file location 
		                                //  from tmpfile location to desired location
		                                
		

	}

}
