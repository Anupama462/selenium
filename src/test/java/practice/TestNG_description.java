package practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_description {
	WebDriver driver;
	
  @Test(description="Verify Logo")
  public void selenium() {
	  driver.get("https://www.selenium.dev");
	  driver.findElement(By.xpath("//*[@id=\"Layer_1\"]")).click();
	 
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
