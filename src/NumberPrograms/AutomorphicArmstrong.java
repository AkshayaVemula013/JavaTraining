package NumberPrograms;

public class AutomorphicArmstrong {
	public static boolean isAutomorphic(int num)
	{
		int sq=num*num;
		int LD1=num%10;
		int LD2=sq%10;
		
		return LD1==LD2;
	}
	
	/*{
        int sq = N * N;
        int temp = N;
        while(temp > 0)
        {
            if(temp % 10 != sq % 10) return false;
            temp /= 10;
            sq /= 10;
        }
        return true;
    }*/
	
	
	public static boolean isArmstrong(int num)
	{
	    int temp = num;
	    int sum = 0;
	    int count = 0;

	    // count digits
	    while(temp != 0)
	    {
	        count++;
	        temp = temp / 10;
	    }
	    temp = num;
	    while(temp != 0)
	    {
	        int digit = temp % 10;

	        int power = 1;
	        for(int i = 1; i <= count; i++)
	        {
	            power = power * digit;
	        }
	        sum += power;
	        temp = temp / 10;
	    }
	    return sum == num;   
	}

	public static void main(String[] args)
	{
	    System.out.println("Automorphic Numbers:");
	    for(int i=1;i<=100;i++)
	    {
	        if(isAutomorphic(i))
	            System.out.println(i);
	    }

	    System.out.println("Armstrong Numbers:");
	    for(int i=1;i<=100;i++)
	    {
	        if(isArmstrong(i))
	            System.out.println(i);
	    }
	}



}
