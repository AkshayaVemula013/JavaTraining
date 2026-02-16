//135 = 1^1 + 3^2 + 5^3

package NumberPrograms;

public class DisariumNumber {
	public static int count(int num){
        int count=0;
        while(num!=0){
        count++;
        num=num/10;
        }
        return count;
    }			
	
	public static int power(int digit,int pow)
    {
        int res=1;
        for(int i=1;i<=pow;i++)
        {
            res=res*digit;
        }
        return res;
    }
	public static boolean isDisarium(int num)
	{
		int sum=0;
		int temp=num;
		int count=count(num);
		while(temp!=0)
		{
			sum+=power(temp%10,count);
			count--;
			temp=temp/10;
		}
		
		if(sum==num) return true;
		return false;
	}
	public static void main(String[] args)
	{
		System.out.println(isDisarium(376));
		System.out.println(isDisarium(135));
	}
	

}
