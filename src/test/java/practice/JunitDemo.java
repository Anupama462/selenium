package practice;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class JunitDemo {

	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Ignore
	@Test
	public void idnameclassnamecssselector() throws InterruptedException {
		driver.get("http://www.hyderabadreport.com/user");
		Thread.sleep(2000);
		driver.findElement(By.id("edit-name")).sendKeys("anu");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("123");
		Thread.sleep(2000);
		/*
		 * driver.findElement(By.cssSelector("input#edit-submit")).click();
		 * driver.findElement(By.cssSelector("#edit-submit")).click();
		 * driver.findElement(By.cssSelector("input.form-submit")).click();
		 * driver.findElement(By.cssSelector(".form-submit")).click();
		 */
        driver.findElement(By.className("form-submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("edit-name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("edit-name")).sendKeys("anupama");

	}

	@Ignore
	@Test
	public void linktextpartiallinktext() throws InterruptedException {
		driver.get("http://www.hyderabadreport.com/user");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Photos")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Greater")).click();
		Thread.sleep(2000);
	}
	
	@Ignore
	@Test
	public void tagName() throws InterruptedException {

		driver.get("http://www.ndtv.com");
		Thread.sleep(2000);
		
		List<WebElement> ndtvlinks = driver.findElements(By.tagName("a"));
	//	System.out.println(ndtvlinks.size());
		
		System.out.println("Total no.of links in NDTV : "+ndtvlinks.size());
		
	}
	
	
	@Test
	public void xpath() throws InterruptedException {
		driver.get("http://www.hyderabadreport.com/user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).sendKeys("Anupama");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/nav/div/ul/li[11]/a")).click();
		
		}
}