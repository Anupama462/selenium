package MavenFramework.SeleniumTesting;

public class Demo15ArraysMultiDimen {

	public static void main(String[] args) {
		
		int[][] myMultiDimArray = new int[2][3];
		
		
		myMultiDimArray[0][0]=2;
		myMultiDimArray[0][1]=3;
		myMultiDimArray[0][2]=5;
		myMultiDimArray[1][0]=6;
		myMultiDimArray[1][1]=8;
		myMultiDimArray[1][2]=9;
		
		System.out.println(myMultiDimArray[1][2]);
		

		int[][] myMultiDimArray1 = {{2,3,5},{6,8,9}};
		
		System.out.println(myMultiDimArray[1][2]);
		
		for(int i=0;i<myMultiDimArray1.length;i++)
		{
			for(int j=0;j<myMultiDimArray1[i].length;j++)
			{
				System.out.println(myMultiDimArray1[i][j]);
			}
		}
		
	}

}
