package practice;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {
	
	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	public void test1() {
		driver.get("https://www.x.com");
		
	}
	
	@Ignore
	@Test
	public void test2() {
		driver.get("https://www.google.com");
		
	}
	@Test
	public void test3() {
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void test4() {
		driver.get("https://www.selenium.dev");
		
	}
	@Test
	public void test5() {
		driver.get("https://www.redmine.org");
		
	}

}
