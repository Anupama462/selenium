package practice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class fileupload {
	WebDriver driver;
  @Test
  public void uploadfile() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.get("http://baalabharathi.com/upload-story/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"field-SUtF8PwfCXGXx46\"]")).sendKeys("techlearn.in");
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
  }

}
