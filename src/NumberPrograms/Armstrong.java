package NumberPrograms;

public class Armstrong {
	public static boolean isArmstrong(int num) 
	{
	    int pow=count(num);
	    int sum=0;
	    int temp=num;
	    while(num!=0)
	    {
	        int digit=num%10;
	        sum=sum+power(digit,pow);
	        num=num/10;
	    }
	    if(sum==temp)
	    {
	        return true;
	    }
	    return false;
	}
	public static int power(int digit,int pow)
	    {
	        int res=1;
	        for(int i=1;i<=pow;i++)
	        {
	            res=res*digit;     //res * digit pow times
	        }
	        return res;
	    }
	public static int count(int num)
		{
	        int count=0;
	        while(num!=0)
	        {
	        count++;
	        num=num/10;
	        }
	        return count;
	    }
	    
	public static void main(String[] args)
		{
			System.out.println(isArmstrong(153));
			System.out.println(isArmstrong(45));
		}

}
