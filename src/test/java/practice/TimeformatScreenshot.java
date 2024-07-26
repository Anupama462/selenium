package practice;

import org.testng.annotations.Test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TimeformatScreenshot {
	WebDriver driver;
	
	public void TakeScreenshot() {
		  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		  Date date = new Date();
		  String time = dateFormat.format(date);
		  
		  File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(f, new File("G:\\anupama\\Screenshots\\Google_" + time + ".png"));
	
	}
  @Test
  public void googlesearch() throws InterruptedException {
	  driver.get("https://google.com");
	  Thread.sleep(2000);
	  TakeScreenshot();
	  
	  driver.findElement(By.name("q")).sendKeys("India");
	  Thread.sleep(2000);
	  TakeScreenshot();
	  
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
	  TakeScreenshot();
	  
	  driver.findElement(By.xpath("//*[@id=\"hdtb-tls\"]")).click();
	  Thread.sleep(2000);
	  TakeScreenshot();
	  
	  
	  
	  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
