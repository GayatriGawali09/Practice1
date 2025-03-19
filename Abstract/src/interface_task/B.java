package interface_task;

import java.util.Scanner;

public class B implements Shape {
	@Override
	public void Area_circle()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius of circle: ");
		int r=sc.nextInt();
		float pi=(float) 3.145;
		System.out.println("arae of circle " + (pi*r*r) );
		
	}
	public void Area_rectangle()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of rectangle: ");
		int l=sc.nextInt();
		System.out.println("enter breadth of reactangle: ");
		int b=sc.nextInt();
		
		System.out.println("arae of reactangle "+(l*b));
		
	}
	public void Area_square()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter side: ");
		int side=sc.nextInt();
		System.out.println("arae of square "+ (side*side));
	}

}
