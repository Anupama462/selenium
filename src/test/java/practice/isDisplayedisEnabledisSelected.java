package practice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class isDisplayedisEnabledisSelected {
	WebDriver driver;
	
  @Test
  public void isDisplayedmethod() throws InterruptedException {
	  driver.get("https://www.redmine.org/");
	  Thread.sleep(2000);
	  boolean reg = driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).isDisplayed();
	  
	  if(reg==true)
	  {
		  System.out.println("Register link is present in top menu bar");
		  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
		  
	  }
	  else
	  {
		  System.out.println("Register link is not present in top menu bar");
	  }
	  
  }
  
  @Test
  public void isEnabledmethod() throws InterruptedException {
	  driver.get("https://www.redmine.org/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
	  
	  boolean lgn = driver.findElement(By.xpath("//*[@id=\"username\"]")).isEnabled();
	  
	  
	  if(lgn==true)
	  {
		  System.out.println("LOgin textbox is enabled to enter the username");
		  driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("redmine");
		  
		  
	  }
	  else
	  {
		  System.out.println("LOgin textbox is not enabled to enter the username");
	  }
	  
  }
  
  @Test
  public void isSelectedmethod() throws InterruptedException {
	  driver.get("https://www.redmine.org/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"autologin\"]")).click();
	  
	  boolean check = driver.findElement(By.xpath("//*[@id=\"autologin\"]")).isSelected();
	  
	  if(check==true)
	  {
		  System.out.println("Stay logged in checkbox is selected");
		  
	  }
	  else
	  {
		  System.out.println("Stay loggedin checkbox is not selected");
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
  }

}
