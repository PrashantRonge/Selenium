package take_screens_hot_1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Lec_2_SS_permanant {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tatamotors.com/");
		//driver.get("https://www.moneycontrol.com/promo/mc_interstitial_dfp.php?size=1280x540");
		
		Thread.sleep(1000);
		File Temp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		RandomString s = new RandomString();
		String rn = s.make(3);
		
		Thread.sleep(1000);
		File diffscreens = new File("D:\\selenium\\screenshot_permanat\\mypermantscreenshot-"+rn+"-.png");
		
		FileHandler.copy(Temp, diffscreens);
		
		

	}

}
