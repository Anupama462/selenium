package MavenFramework.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/dell/Desktop/chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("//div[@id='header_container']")).click();
//		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
//		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
//      driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
        
     //	    driver.quit();
		
		
        

	}	

	}
