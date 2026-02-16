//Sum of digits = Product of digits
package NumberPrograms;

public class SpyNumber {
	public static boolean isSpy(int num)
	{
		int sum=0;
		int product=1;
		while(num!=0)
        {
            sum+=(num%10);
            product*=(num%10);
            num=num/10;
        }
		
		if (product==sum) return true;
        return false;    
	}
	public static void main(String[] args)
	{
		System.out.println(isSpy(19));
		System.out.println(isSpy(123));
	}


}
