package Array;

public class SwapOddIndexWithImmediateElement {
	
	public static void Swap(int[] arr)
	{
		for(int i=1;i<arr.length-1;i+=2)
		{
			int temp =arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6};
		Swap(arr);
		int[] arr1= {1,2,3,4,5,6,7};
		Swap(arr1);

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+ " ");
		}


	}

}
