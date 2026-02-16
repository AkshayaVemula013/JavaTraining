package NumberPrograms;

public class FibonacciSeries 
{
	public static void printFibonacci(int n)
	{
		int a=0;
		int b=1;
		System.out.print(a+",");
		System.out.print(b+"");
		for(int i=3;i<=n;i++)
		{
			int c=a+b;
			System.out.print(","+c);
			a=b;
			b=c;		
		}
	
	}
	public static void main(String[] args)
	{
		printFibonacci(5);
	}
}
