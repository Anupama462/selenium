package practice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class RCDDMOKF {
	WebDriver driver;
	
  @Test
  public void rightclick() throws InterruptedException {
	  driver.get("http://www.seleniumlearn.com/");
	  Thread.sleep(4000);
	  
	  Actions act = new Actions(driver);
	  act.contextClick(driver.findElement(By.xpath("//*[@id=\"menu-389-1\"]/a"))).build().perform();  
  }
  
  
  @Test
  public void doubleclick() throws InterruptedException {
	  driver.get("http://seleniumlearn.com/double-click");
	  Thread.sleep(4000);
	  
	  Actions act = new Actions(driver);
	  act.doubleClick(driver.findElement(By.xpath("//*[@id=\"node-104\"]/div/div[1]/div/div/button"))).build().perform();  
  }
  
  
  @Test
  public void draganddrop() throws InterruptedException {
	  driver.get("http://www.seleniumlearn.com/drag-and-drop-html");
	  Thread.sleep(4000);
	  
	  Actions act = new Actions(driver);
	  
	  WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	  
	  WebElement target = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	  
	  act.dragAndDrop(source, target).build().perform();
	   
  }
  
  @Test
  public void mouseover() throws InterruptedException {
	  driver.get("http://www.seleniumlearn.com/");
	  Thread.sleep(4000);
	  
	  Actions act = new Actions(driver);
	  
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-336-1\"]/a"))).build().perform();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\\\"menu-557-1\\\"]/a")).click();
	  
	//  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-557-1\"]/a"))).build().perform();
	  
  }
  
  @Test
  public void keyboardkeys() throws InterruptedException {
	  driver.get("https://www.redmine.org/");
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
	  Thread.sleep(4000);
	  
	  Actions act = new Actions(driver);
	  act.sendKeys(Keys.TAB).build().perform();
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
