package practice;

import org.testng.annotations.Test;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v125.page.model.Screenshot;
import org.testng.annotations.BeforeTest;

public class FullpageScreenshot {
	WebDriver driver;
	
  @Test
  public void CompletePageScreenshot() throws InterruptedException {
	  driver.get("https://www.w3schools.com/");
	  Thread.sleep(2000);
	  Screenshot s = new Ashot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	  ImageIO.write(s.getImage(), "PNG", new File("G:\\anupama\\Screenshots\\FullPageScreenshot.png"));
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
