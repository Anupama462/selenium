package practice;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class TestNG_DataProvider {
	WebDriver driver;
	String str;
	
	
	 @DataProvider(name="datainput")
	  public String[][] login()
	 {
	    return new String[][]
	    {
	    	{"navya", "hello@123"},
	    	{"nandini", "demo1234"},
	    	{"sudha", "654231"},
	    	{"sravani", "demo"},
	    	{"madhumathi", "987654321"},
	    	{"roja", "9100201000"},
	    	{"chethan", "9980251000"},
	     };

	 }
  @Test(dataProvider = "datainput")
  public void login(String user, String password) throws InterruptedException {
	   
	  driver.get("http://www.hyderabadreport.com/user");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).sendKeys(user);
	  driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys(password);
	  driver.findElement(By.id("edit-submit")).click();
	  try {
		  driver.findElement(By.linkText("Log out")).click();
		  str = "PASS";
		  System.out.println(str);
	  }
      catch (Exception e)
	  {
    	  str = "FAIL";
    	  System.out.println(str);
    	  
	  }
	  
   }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
  }

}
