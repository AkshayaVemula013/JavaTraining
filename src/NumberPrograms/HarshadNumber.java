//18 ---. 1+8=9 is divisor of 18
package NumberPrograms;

public class HarshadNumber {
	public static boolean isHarshad(int num)
	{
        int sum=0;
        int temp=num;
        while(temp!=0)
        {
            sum+=(temp%10);
            temp=temp/10;
        }
        if(num%sum==0) return true;
        return false;
	}
	
	public static void main(String[] args)
	{
		System.out.println(isHarshad(18));
		System.out.println(isHarshad(78));
	}

}
