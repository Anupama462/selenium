package MavenFramework.SeleniumTesting;

public class Demo3 {

	public static void main(String[] args) {
		
		String str1 = "RCV";
		String str2 = new String("RCV");
		String str3 = "RCV";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1==str3);
		System.out.println(str2==str3);
		System.out.println(str2.equals(str3));
		
		
		

	}

}
