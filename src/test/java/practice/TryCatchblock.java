package practice;

import org.openqa.selenium.WebDriver;

public class TryCatchblock {

	public static void main(String[] args) {
		WebDriver driver;
		
		try
		{
		int[] numbers = {1,2,3,4,};
		System.out.println(numbers[0]);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("something went wrong in ur code");
		}

	}

}
