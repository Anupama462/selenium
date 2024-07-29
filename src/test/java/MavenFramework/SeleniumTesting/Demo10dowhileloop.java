package MavenFramework.SeleniumTesting;

public class Demo10dowhileloop {

	public static void main(String[] args) {

		int i = 1;

		do {
			System.out.println(i);
			i++;
		} while (i > 10);

		System.out.println("Outsisde do while loop");
		
		while (i > 10)
		{
			System.out.println(i);
		}

		System.out.println("Outside while loop");
	}

}
