package MavenFramework.SeleniumTesting;

public class TruckInheritance extends Inheritance{

	public static void main(String[] args) {
		
		TruckInheritance tk = new TruckInheritance();
		  tk.start();
		  tk.stop();

	}
	
	public void loadCapacity()
	{
		System.out.println("Load capacity");
	}
}
