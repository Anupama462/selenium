
package MavenFramework.SeleniumTesting;

import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EXCELDEMO {

	public static <XSSFWorkbook, XSSFSheet> void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C://Users//dell//Desktop//chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        
        File file=new File("C://Users//dell//Desktop//Excel work.xlsx");
        FileInputStream input=new FileInputStream(file);
        XSSFWorkbook workbook=new XSSFWorkbook(input);
        XSSFSheet sheet=workbook.getSheet("Details");
        
        System.out.println(sheet).getLastRowNum());
        System.out.println(sheet).getFirstRowNum();
        int count=sheet.getLastRowNum()-sheet.getFirstRowNum();
        
        workbook.close();
        input.close();
        
        
        
        
        
        
	}

}
