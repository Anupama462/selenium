package keywords;

public class Parent {
	
	public Parent() {
		System.out.println("Parent constructor");
	}
	
	public Parent(int i) {
		System.out.println("Parametarized constructor");
	}

	
	String empName = "Tom";
	int empNo = 12345;
	
	public void getData()
	{
		System.out.println(empName);
		System.out.println(empNo);
	}

}
