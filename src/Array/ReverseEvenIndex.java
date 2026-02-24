package Array;

public class ReverseEvenIndex {
	
	public static void Reverse(int arr[])
	{
		int i=0;
		int j;
		if ((arr.length-1)%2==0) j =arr.length-1;
		else j=arr.length-2;
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i+=2;
			j-=2;
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6};
		Reverse(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
	}

}
