package Array;

public class MaxArray {		
public static  int maxArray(int[] arr) {
		
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]){
				max=arr[i];
			}
		}return max;
		
				
	}
	public static void main(String[] args) {
		int[] arr= {4,3,1,7,9};
		System.out.println(maxArray(arr));
	}
}