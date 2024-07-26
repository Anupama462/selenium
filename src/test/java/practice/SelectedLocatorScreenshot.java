package practice;

import org.testng.annotations.Test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SelectedLocatorScreenshot {
	WebDriver driver;
	
  @Test
  public void TakeScreenshot() throws InterruptedException {
	  driver.get("https://www.google.com/");
	  Thread.sleep(2000);
	  
	  WebElement logo = driver.findElement(By.xpath("//*[@id=\"hplogo\"]"));
	  
	  File f = logo.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f, new File("G:\\anupama\\Screenshots\\GoogleLogo.png"));
	  
	  
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
  }

}
