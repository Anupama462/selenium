package MavenFramework.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example5 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C://Users//dell//Desktop//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement firstName=driver.findElement(By.name("firstName"));
		boolean value=firstName.isDisplayed();
		firstName.sendKeys("Anupama");
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/font/b")).getText();
		
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.partialLinkText("REGIS")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Anupama");
		
		driver.findElement(By.name("lastName")).sendKeys("potluri");
		
		Select sel=new Select(driver.findElement(By.name("country")));
		
//      Select by visible text
		sel.selectByVisibleText("AUSTRIA");
//		Select by index
		sel.selectByIndex(0);
//		Select by value
		sel.selectByValue("ALBANIA");
		
		driver.findElement(By.name("submit")).click();
//		driver.quit();


	}

}
