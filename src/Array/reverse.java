package Array;

public class reverse {
	public static int[] reverse(int[] arr) {
		int[] rev=new int[arr.length];
		int j=0;
		for(int i=arr.length-1;i>0;i--) {
			rev[j++]=arr[i];
		}
		return rev;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int[] res=reverse(arr);
		System.out.println("before");
		for(int i=0;i<res.length;i++) {
			System.out.print(arr[i]+" , ");
		}
		System.out.println();
		System.out.println("after");
		for(int i=0;i<res.length;i++) {
			System.out.print(arr[i]+" , ");
		}

}
}