package Array;

public class demo {
	public static int sum(int[] b)
	{
		System.out.println(b);
		int sum=0;
		for (int i=0;i<b.length;i++)
		{
			sum+=i;
		}
		return sum;
	}
	
	
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5};
		System.out.println(arr);
		System.out.println(sum(arr));
	}



}
