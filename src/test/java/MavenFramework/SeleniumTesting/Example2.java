package MavenFramework.SeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.org/login");
		
		driver.manage().window().maximize();
		
		driver.quit();
		
		
		

	}

}
