package practice;

import org.testng.annotations.Test;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BugScreenshot {
	WebDriver driver;
	
  @Test
  public void errorScreenshot() {
	  
	  File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f, new File("F:\\ANUPAMA\\ErrorPageScreenshot.png"));
	  
	  
	  
	  
  }
  
  @Test
  public void errorScreenshot() {
	  
	  File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f, new File("F:\\ANUPAMA\\ErrorPageScreenshot.png"));
	  
	  
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
