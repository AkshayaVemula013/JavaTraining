package Array;

public class MergeArray {
	public static int[] Merge(int[]arr1,int[]arr2)
	{
		int[] arr3=new int[arr1.length+arr2.length];
		int index=0;					//instead of arr1.length +i while merging 2nd array
		
		for(int i=0;i<arr1.length;i++)
		{
			arr3[index++]=arr1[i];
		}
		 for (int i = 0; i < arr2.length; i++) 
		 {
			arr3[index++] = arr2[i];				
		 }
		 return arr3;
	}
	
	public static void main(String[] args)
	{
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6};
		
		 int[] res = Merge(arr1, arr2);

	        for (int i = 0; i < res.length; i++) {
	            System.out.print(res[i] + " ");
	        }
	}

}





