package practice;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class popupalertwindowhandles {
	WebDriver driver;
	
  @Test
  public void alertokbuttonclick() throws InterruptedException {
	  driver.get("http://seleniumlearn.com/confirmation-dialog-box");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(2000);
	  
	  driver.switchTo().alert().accept();
	  
	  
  }
  
  @Test
  public void alertcancelbuttonclick() throws InterruptedException {
	  driver.get("http://seleniumlearn.com/confirmation-dialog-box");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(2000);
	  
	  driver.switchTo().alert().dismiss();
	  
  }
	  
  
  @Test
  public void alertsendtextokbuttonclick() throws InterruptedException {
	  driver.get("http://seleniumlearn.com/prompt-dialog-box");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(2000);
	  
	  Alert a = driver.switchTo().alert();
	  a.sendKeys("anupama");
	  a.accept();
	 
	  
	/*  driver.switchTo().alert().sendKeys("anupama");
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();  */
	 
	  
  }
	 
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
