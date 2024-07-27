package practice;

import org.testng.annotations.Test;

import java.time.Duration;
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
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  	  
	  driver.switchTo().frame("iframeResult");
	  
	  
	//  driver.switchTo().frame(5);
	  
	  
	/*  WebElement obj = driver.findElement(By.id("iframeResult"));
	  driver.switchTo().frame(obj);    */
	  
	  	  
	  driver.findElement(By.xpath("/html/body/button")).click();
	  	  
	  driver.switchTo().alert().accept();
	  
	  driver.switchTo().defaultContent();
	  
	  driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
	  
	//  driver.findElement(By.xpath("//*[@id=\"subtopnav\"]/a[5]")).click();
	  
	  	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
