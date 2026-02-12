package MembersOfClass;

public class TestRect {

	public static void main(String[] args)
	{
		Rect a=new Rect();
		
		double a1=a.area(1,2);
		System.out.println(a1);
		
		double a2=a.area(4,6);
		System.out.println(a2);
		
		double a3=a.area(3.6,7.8);
		System.out.println(a3);
		
		System.out.println();
		
		double p1=Rect.peri(1,2);
		System.out.println(p1);
		
		double p2=Rect.peri(4,6);
		System.out.println(p2);
		
		double p3=Rect.peri(3.6,7.8);
		System.out.println(p3);
	}

}
