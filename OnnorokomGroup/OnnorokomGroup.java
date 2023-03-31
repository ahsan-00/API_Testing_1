package OnnorokomGroup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OnnorokomGroup{
		public void function() throws InterruptedException{
			WebDriverManager.chromedriver().setup();
			
			// create a chromeDriver object named driver.
			WebDriver driver = new ChromeDriver();

			// go to google web page
			driver.get("https://www.onnorokomsoftware.com/");
			// Maximize the browser window
			driver.manage().window().maximize();
			

			Thread.sleep(5000);
			// close the browser all active window
			driver.quit();
	     }
	}	

