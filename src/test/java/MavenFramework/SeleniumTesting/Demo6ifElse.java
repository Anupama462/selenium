package MavenFramework.SeleniumTesting;

public class Demo6ifElse {

	public static void main(String[] args) {
		int num1 = 40;
		int num2 = 20;
		int num3 = 30;
		
		

		if (num1 > num2) {
          System.out.println("Number 1 is greater than number 2");
		
		  if(num2<num3)
		  {
			System.out.println("within nested if else");
		  }
		  else
		  {
			System.out.println("in the nested else block");
		  }
	}
		else if(num1==num2)
		{
			System.out.println("Number 1 is equal to num2");
		}
		else if(num1<num2)
		{
			System.out.println("number 1 is less than num2");
		}
	}

}
