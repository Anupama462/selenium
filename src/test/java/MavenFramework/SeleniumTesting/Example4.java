package MavenFramework.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//dell//Desktop//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
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
