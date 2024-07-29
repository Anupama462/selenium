package MavenFramework.SeleniumTesting;

public class MethodOverloading {

	public static void main(String[] args) {
	
		MethodOverloading mo = new MethodOverloading();
		mo.login(98745, "abcd", 4523);
		mo.login("rcv", "rcv");

	}
	
	public void login(String s, String p) {
		System.out.println("Login successful using username and password");
	}

	public void login(int s, String p) {
		System.out.println("Login successful using phonenumber and password");
		
	}
	
	public void login(int s, String p, int t) {
		System.out.println("Login successful using phnnumber/pin and password");
	}
}
