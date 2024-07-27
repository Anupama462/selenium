package practice;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;

public class BugScreenshot {
	WebDriver driver;

	
	public void BugScreenshot() throws WebDriverException, IOException {
		
		FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("G:\\anupama\\Screenshots\\ErrorPageScreenshot.png"));
		  
	//	  File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	  FileUtils.copyFile(f, new File("G:\\anupama\\Screenshots\\ErrorPageScreenshot.png"));
		  
	  
  }
  
  @Test
  public void googlesearch() throws InterruptedException {
	 driver.get("https://www.google.com/");
	 Thread.sleep(2000);
	 
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
