//sum of factorial of digits = num

package NumberPrograms;

public class StrongNumber {
	public static boolean isStrong(int n)
	{
		int sum=0;
		int temp=n;
		while(temp!=0)
		{
			int digit=temp%10;
			sum+=factorial(digit);
			temp/=10;
		}
		if(sum==n) return true;
		return false;	
	}
	
	
	public static long factorial(int n) {
        long fact=1;
		for(int i=2;i<=n;i++) {
			fact*=i;
		}
		return fact; 
    }
	
	public static void main(String[] args)
	{
		System.out.println(isStrong(36));
		System.out.println(isStrong(145));
	}

}
