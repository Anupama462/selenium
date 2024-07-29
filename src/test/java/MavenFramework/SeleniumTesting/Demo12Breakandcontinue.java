package MavenFramework.SeleniumTesting;

public class Demo12Breakandcontinue {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				continue;
			}
			
			System.out.println(i);
		}
		System.out.println("Final statement");
	}

}
