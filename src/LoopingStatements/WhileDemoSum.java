//Sum of n natural numbers


package LoopingStatements;

public class WhileDemoSum {
	public static int Sum(int n)
	{
		int i=1;
		int sum=0;
	
		while (i<=n)
		{
			sum+=i;
			i++;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int n=10;
		int res=Sum(n);
		System.out.println("Sum of first "+ n +" natural numbers is "+res);
	}
}
