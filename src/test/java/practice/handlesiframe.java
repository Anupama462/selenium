package practice;

import org.testng.annotations.Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class handlesiframe {
	WebDriver driver;
	
  @Test
  public void iframes() throws InterruptedException {
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  Thread.sleep(0);
	  
	  driver.switchTo().frame("iframeResult");
	  
	  
	//  driver.switchTo().frame(5);
	  
	  
	/*  WebElement obj = driver.findElement(By.id("iframeResult"));
	  driver.switchTo().frame(obj);    */
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("/html/body/button")).click();
	  Thread.sleep(2000);
	  
	  driver.switchTo().alert().accept();
	  Thread.sleep(2000);
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
