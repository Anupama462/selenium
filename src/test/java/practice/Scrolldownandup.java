package practice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.BeforeTest;

public class Scrolldownandup {
	WebDriver driver;
	
  @Test
  public void scrolldown() throws InterruptedException {
	  
	  driver.get("https://www.selenium.dev");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
	  Thread.sleep(2000);
	  
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("scroll(0, 3300)");
	  
	  Thread.sleep(2000);
	  
	  
	//  driver.findElement(By.xpath("/html/body/div/main/div[9]/div/div/p[1]/a")).click();
	//  Thread.sleep(2000);
	  
  }
  
  @Test
  public void scrollup() throws InterruptedException {
	  
	//  driver.get("https://www.selenium.dev");
	//  Thread.sleep(2000);
	//  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
	    Thread.sleep(2000);
	  
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("scroll(3300, 0)");
	  
	  Thread.sleep(2000);
	  
  }

  @Test
  public void IdentifyLocatorElement() throws InterruptedException {
	  driver.get("https://www.selenium.dev");
	  driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
	  {
		  WebElement element = (WebElement) driver.findElement(By.xpath("/html/body/div/main/div[9]/div/div/p[1]/a"));
		  Coordinates coordinate = ((Locatable)element).getCoordinates();
		  coordinate.onPage();
		  coordinate.inViewPort();
		   }
  
	  driver.findElement(By.xpath("/html/body/div/main/div[9]/div/div/p[1]/a")).click();
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
