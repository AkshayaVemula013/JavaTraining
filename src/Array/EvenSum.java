package Array;

public class EvenSum {
	public static int Sum(int[] arr1)
	{
		{
			int sum = 0;
	        for (int i=0;i<arr1.length;i+=2) sum+=arr1[i];
	        
	        return sum;
		}

	}
	
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6};
		System.out.println(Sum(arr));
	}
}
