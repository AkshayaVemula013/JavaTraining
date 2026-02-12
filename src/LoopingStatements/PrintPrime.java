package LoopingStatements;
public class PrintPrime {
	public static boolean prime(int num)
	{
		if (num <= 1) return false;
		for(int i=2;i<num;i++)			//		for(int i=2;i<num/2;i++) or for(int i=2;i<Math.sqrt(num);i++)
		{
			if(num%i==0) return false;		
		}
		return true;
	}
	public static void prime()

	{
		int count=0;
		int i=101;
		while(count<20)
		{
		if (prime(i) == true)	
		{
			count++;
			System.out.println(i);
		}
		i+=2;  //instead of i++ to jus avoid even numbers
		}
	}
	public static void main(String[] args) 
	{
		prime();
	}
}
