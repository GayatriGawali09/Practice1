package task1;

import java.util.Scanner;

public class B implements   Empolyee{
	

	public void add_employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter emplyee:");
       String s=sc.next();
       
      System.out.println(s);
      this.salary_credited();
	}
	public void salary_credited()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter salary: ");
		float f=sc.nextFloat();
		System.out.println(f);
		this.remove_employee();
	}
	public void remove_employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("emplyee removed");
		String s=sc.next();                                                                                                             
		System.out.println(s);
	}
}
