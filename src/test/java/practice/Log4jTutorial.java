package practice;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jTutorial {
	WebDriver driver;
	
  @Test
  public void google() {
	  
	  Logger log = Logger.getLogger("Search");
	  PropertyConfigurator.configure("Log4j.properties");
	  
	  driver = new ChromeDriver();
	  log.info("Chrome browser launched");
	  
	  driver.manage().window().maximize();
	  log.info("Browser window maximized");
	  
	  driver.get("https://www.google.com");
	  log.info("Navigate to the google application");
	  
	  driver.findElement(By.name("q")).sendKeys("Apache Log4j");
	  log.info("In google search Apache Log4j text enter");
	  
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  log.info("Enter button pressed");
	  
  }
}
