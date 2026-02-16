package DecisionStatements;

public class SecondLargest {
	public static String secondLargest(int a, int b, int c)
	{
		if((a>b && a<c)|| a>c && a<b)
		{
			return (a+" is second largest");
		}
		else if((b>a && b<c)|| b>c && b<a )
		{
			return (b+" is second largest");
		}
		return (c+ " is the 2nd largest");
	}
	
	public static void main(String[] args)
	{
		System.out.println(secondLargest(1,2,3));
		System.out.println(secondLargest(2,0,4));
		System.out.println(secondLargest(4,0,3));
	}

	

}
