package MavenFramework.SeleniumTesting;

public class Demo7TernaryOperator {

	public static void main(String[] args) {
		// variable = (condition) ? TrueExpression : FalseExpression
		int num1 = 20;
		int num2 = 40;
	
		if (num1 > num2) {
			System.out.println("num1 > num2");
		}
		else {
			System.out.println("num1 < num2");
		}
		
		boolean result = (num1 > num2) ? true : false;
		
		System.out.println(result);
		
			
	}

}
