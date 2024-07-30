package keywords;

public class Thiskeyword {
	
	int x = 10;
	int y = 20;
	String s = "RCV";
	
	public Thiskeyword()
	{
		System.out.println("default");
	}
	
	public Thiskeyword(int x, int y)
	{
		this.x=x;
		this.y=y;
		System.out.println(x+y);
		System.out.println("default");
	}
	

	public static void main(String[] args) {
		
		Thiskeyword tk = new Thiskeyword();
		tk.getData();

	}

	public void getData() {
		
		int x=40;
		int y=50;
		System.out.println(this.x+this.y);
		System.out.println(x+y);
		getData1();
	}
	
public void getData1() {
		
		int x=40;
		int y=50;
		System.out.println(this.x+this.y);
		System.out.println(x+y);
	}

}
