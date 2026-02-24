//Sum of numbers from odd indexes

package Array;

public class OddIndexSum {
	
	
	public static int Sum(int[] arr1)
	{
		int sum = 0;
        for (int i=1;i<arr1.length;i+=2) sum+=arr1[i];
        
        return sum;
	}
	
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6};
		System.out.println(Sum(arr));
	}

}



/*public class SumOddIndex {
public static void main(String[] args) {

int[] arr = {10, 20, 30, 40, 50};
int sum = 0;

for (int i = 1; i < arr.length; i += 2) {
    sum += arr[i];
}

System.out.println("Sum of elements at odd indexes: " + sum);
}
}*/



/*import java.util.Scanner;

public class SumOddIndex {

    // Method to calculate sum of elements at odd indexes
    public static int sumOddIndex(int[] arr) {
        int sum = 0;

        for (int i = 1; i < arr.length; i += 2) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = sumOddIndex(arr);
        System.out.println(result);
    }
}*/