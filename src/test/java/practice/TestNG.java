package practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG {
	
	WebDriver driver;
	
  @Test(priority=0)
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  
  @Test(priority=1, enabled=false)
  public void google() {
	  driver.get("https://www.google.com");
  }
  
  @Test(priority=2)
  public void twitter() {
	  driver.get("https://www.x.com");
  }
  
  @Test(enabled=true)
  public void selenium() {
	  driver.get("https://www.selenium.dev");
  }
  
  @Ignore
  @Test(priority=3)
  public void gmail() {
	  driver.get("https://www.gmail.com");
  }
  
  @Test(priority=4)
  public void redmine() {
	  driver.get("https://www.redmine.org");
  }
  
  @Test(priority=5)
  public void seleniumlearn() {
	  driver.get("https://www.seleniumlearn.com");
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
	  
  }

}
