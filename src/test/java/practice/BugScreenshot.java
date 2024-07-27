package practice;

import org.testng.annotations.Test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BugScreenshot {
	WebDriver driver;

	
	public void BugScreenshot() {
		  
		  File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(f, new File("G:\\anupama\\Screenshots\\ErrorPageScreenshot.png"));
		  
	  
  }
  
  @Test
  public void googlesearch() {
	 driver.get("https://www.google.com/");
	 
	 try
	 {
		 driver.findElement(By.name("q")).sendKeys("India");
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 driver.findElement(By.xpath("//*[@id=\"hdtb-tls-jshshsij\"]")).click();
		 driver.findElement(By.xpath("//*[@id=\"tn_1\"]/span[3]/a/div/span")).click();
		  
	 }
	  catch (Exception e)
	 {
		  System.out.println("======Bug due to take reason=====");
		  BugScreenshot();
		  
	 }
	  
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
