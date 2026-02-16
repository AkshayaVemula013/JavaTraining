//num = sum of square of digits

package NumberPrograms;

public class NeonNumber {
	public static boolean isNeon(int num)
	{
		int sq=num*num;
		int sum=0;
		while(sq!=0)
        {
            sum+=(sq%10);
            sq=sq/10;
        }
		if (num==sum) return true;
        return false;    
	}
	public static void main(String[] args)
	{
		System.out.println(isNeon(9));// 9sq =81 ----> 8+1=9
		System.out.println(isNeon(145));
	}

}
