package MavenFramework.SeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//dell//Desktop//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
	    driver.manage().window().maximize();
	    
	    
	    driver.quit();
	    
	    
		
		

	}

}
