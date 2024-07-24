package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMaxMinCloseQuit {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
	//	driver = new FirefoxDriver();
		
	//	driver.manage().window().maximize();
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(3000);
		
	//	driver.close();
		
		driver.quit();
		
		
	}

}
