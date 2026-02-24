package Array;

public class Demo1 {
	public static int[] plusOne(int[] arr)
	{
		int[] arr1= new int[arr.length+1];
		for(int i=0; i<arr.length;i++)
		{
			arr1[i]=arr[i];
		}
		arr1[arr1.length-1]=10;
		return arr1;
	}
	
	
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5};
		int[] res=plusOne(arr);
		for(int i=0; i<res.length; i++)
		{
		System.out.println(res[i]);
		}
	}

}
