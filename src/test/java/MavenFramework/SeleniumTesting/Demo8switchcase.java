package MavenFramework.SeleniumTesting;

public class Demo8switchcase {

	public static void main(String[] args) {
		/*
		 * switch(expression){ case 1: statements case 2: statements
		 * 
		 * default: statements
		 */

		int day = 8;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tue");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thu");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;
		case 7:
			System.out.println("Sun");
			break;
		default:
			System.out.println("None of the cases satisfied");

		}
	}

}
