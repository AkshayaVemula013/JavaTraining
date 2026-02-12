package DecisionStatements;

public class TypeOfTriangle {
	public static void triangleType(int a, int b, int c)
	{
		if (a==b && b==c)
		{
			System.out.println("It is an Equivalent triangle");
		}
		else if(a==b || b==c || a==c)
		{
			System.out.println("It is an Isosceles triangle");
		}
		else
		{
			System.out.println("It is an Scalen triangle");
		}

	}
	
	public static void main(String[] args)
	{
		triangleType(2,2,2);
		triangleType(2,3,2);
		triangleType(2,3,4);
		
	}

}
