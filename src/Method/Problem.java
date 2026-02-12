//Create 6 variables for each subject
//Create different methods to calc avg & percentage
//find percentage for best of 5 amd total percentage considering all 6 subjects


package Method;

public class Problem
{
	public static double Sum(int a, int b, int c, int d, int e)
	{
		return (a+b+c+d+e);
	}

	public static int Sum(int a, int b, int c, int d, int e, int f)
	{
		return (a+b+c+d+e+f);
	}
	
	public static double Average(double sum,int n)
	{
		double avg=((double)sum)/n;
		return (avg);
	}
	public static double Percentage(double sum,int n)
	{
		double Per=(((double)sum)/(n*100))*100;
		return (Per);
	}
	

	public static void main(String[] args)
	{
		int a=90;
		int b=90;
		int c=90;
		int d=90;
		int e=90;
		int f=90;
		
		double Sum5=Sum(a,b,c,d,e);
		double avg5=Average(Sum5,5);
		
		System.out.println(Sum5);
		System.out.println(avg5);
		
		double Sum6=Sum(a,b,c,d,e,f);
		double avg6=Average(Sum5,5);
		
		System.out.println(Sum6);
		System.out.println(avg6);
		
	}
}