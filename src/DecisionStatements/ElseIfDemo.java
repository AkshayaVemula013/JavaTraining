package DecisionStatements;

public class ElseIfDemo {
	public static void Compare(int a,int b)
	{
		if (a==b)
			System.out.println("Equal");
		if (a>b)
			System.out.println("a is bigger");
		else
			System.out.println("b is bigger");
				
	}
	public static void main(String[] args)
	{
		Compare(20,30);
	}
	

}
