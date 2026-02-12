package Operators;

public class TypeCasting {
	public static void main(String[] args)
	{
		int a=10;
		double b=a;//implicit Widening
		System.out.println(b);
		double c= (double)a; //explicit widening
		int d=(int)b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

}
