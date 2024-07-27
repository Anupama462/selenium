package practice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class CrossBrowserParameters {
	WebDriver driver;
	
	
	 @Parameters({ "browser" })
	 @BeforeTest
	  public void openBrowser(String browser) {
		 
		 try {
			 
			 if (browser.equalsIgnoreCase("Firefox"))
			 {
				 driver = new FirefoxDriver();
				 driver.manage().window().maximize();
			 }
			 
			 else if (browser.equalsIgnoreCase("Chrome"))
			 {
				 driver = new ChromeDriver();
				 driver.manage().window().maximize();
			 }
			 
			 else if (browser.equalsIgnoreCase("Edge"))
			 {
				 driver = new EdgeDriver();
				 driver.manage().window().maximize();
			 }
			 
		 }
		 catch (WebDriverException e) {
			 System.out.println(e.getMessage());
			 
		 }
		     }
	 
  @Test
  public void redmine() {
	  driver.get("https://www.redmine.org");
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("techlearn.in");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc");
  }
  
  @Test
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
	  
	  @Test
	  public void selenium() {
		  driver.get("https://www.selenium.dev");
	  }
		  
		  @Test
		  public void seleniumlearn() {
			  driver.get("http://www.seleniumlearn.com");
			  
		  }
		  
 @AfterTest
 public void afterTest() {
	driver.quit();
	
		  
  	  
  }

}
