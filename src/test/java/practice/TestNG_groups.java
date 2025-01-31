package practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_groups {
	
	WebDriver driver;
	
  @Test(groups="social")
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  
  @Test(groups="social")
  public void google() {
	  driver.get("https://www.google.com");
  }
  
  @Test(groups="social")
  public void twitter() {
	  driver.get("https://www.x.com");
  }
  
  @Test(groups="tech")
  public void selenium() {
	  driver.get("https://www.selenium.dev");
  }
  
  @Test(groups="social")
  public void gmail() {
	  driver.get("https://www.gmail.com");
  }
  
  @Test(groups="tech")
  public void redmine() {
	  driver.get("https://www.redmine.org");
  }
  
  @Test(groups="tech")
  public void seleniumlearn() {
	  driver.get("https://www.seleniumlearn.com");
  }
  
  @BeforeTest(groups="social")
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
	  
  }

}
