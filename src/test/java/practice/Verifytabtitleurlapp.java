package practice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Verifytabtitleurlapp {
	WebDriver driver;
	
  @Test
  public void verifytabtitle() {
	  driver.get("https://www.google.com");
	  
	  String exptabtitle = "Google";
	  System.out.println("Expected tab title is :"+exptabtitle);
	   
	  String acttabtitle = driver.getTitle();
	  System.out.println("Actual tab title is :"+acttabtitle);
	  
	  Assert.assertEquals(acttabtitle, exptabtitle);
	  
	  
	  
  }
  @Test
  public void verifyurl() {
	  driver.get("https://www.google.com/");
	  
	  String expurl = "https://www.google.com/";
	  
	  String acturl = driver.getCurrentUrl();
	  
	  Assert.assertEquals(acturl, expurl);
	 
  }
  
  @Test
  public void verifytabtext() {
	  driver.get("https://www.google.com");
	  
	  String expgtext = "Gmail";
	  
	  String actgtext = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).getText();
	  
	  Assert.assertEquals(actgtext, expgtext);
	  
	  String expimgtect = "Images";
	  
	  String actimgtext = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")).getText();
	  
	  Assert.assertEquals(actimgtext, expimgtect);
	  
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
