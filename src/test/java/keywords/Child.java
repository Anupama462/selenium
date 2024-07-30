package keywords;

public class Child extends Parent{
	
	public Child() {
		super(3);
		
	}
	
	String empName = "abbbay";
	int empNo = 98765;

	public static void main(String[] args) {
		Child c = new Child();
		c.getData();

	}
	
	public void getData()
	{
	//	super.getData();
		
		
		System.out.println(empName);
		System.out.println(empNo);
	}

}
