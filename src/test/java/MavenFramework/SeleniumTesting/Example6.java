package MavenFramework.SeleniumTesting;

import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//dell//Desktop//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        driver.manage().window().maximize();
        
        WebElement tableId=driver.findElement(By.id("customers"));
        List<WebElement> tablesRows=tableId.findElements(By.tagName("tr"));
      
        for(int i=0;i<tablesRows.size();i++) {
        	if(i==0) {
        		List<WebElement> headers=tablesRows.get(i).findElements(By.tagName("th"));
        		System.out.println(headers.get(0).getText());
        		System.out.println(headers.get(1).getText());
        		System.out.println(headers.get(2).getText());
        	}else {
        		List<WebElement> tableData=tablesRows.get(i).findElements(By.tagName("td"));
        		System.out.println(tableData.get(0).getText());
        		System.out.println(tableData.get(1).getText());
        		System.out.println(tableData.get(2).getText());
        	}
        }
        File srcFile=((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("D:/TablesScreenshot.jpg"));
	}
	
        driver.quit();
        
        
}
