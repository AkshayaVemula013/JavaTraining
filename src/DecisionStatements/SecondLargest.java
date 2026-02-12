package DecisionStatements;

public class SecondLargest {
	public static String secondLargest(int a, int b, int c)
	{
		if((a>b && a<c)|| a>c && a<b)
		{
			System.out.println(a+" is second largest");
		}
		else if((b>a && b<c)|| b>c && b<a )
		{
			System.out.println(b+" is second largest");
		}
		return (c+ "is the 2nd largest");
	}
	
	public static void main(String[] args)
	{
		secondLargest(1,2,3);
		secondLargest(2,0,4);
		secondLargest(1,0,4);
	}

	

}
