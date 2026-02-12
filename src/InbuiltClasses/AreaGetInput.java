package InbuiltClasses;

import java.util.Scanner;

import MembersOfClass.Rect;

public class AreaGetInput {
	public static void main(String[] args)
	{
		Rect a=new Rect();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente1r length: ");
		double l1=sc.nextDouble();
		System.out.println("Enter breadth: ");
		double b1=sc.nextDouble();
		
		
	
		double a1=a.area(l1,b1);
		System.out.println("Area= "+a1);
		
		
		System.out.println();
		
		double p1=Rect.peri(l1,b1);
		System.out.println("perimeter= "+p1);
		
	}
}
