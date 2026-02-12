package LoopingStatements;

public class ForOddEven {
	public static void OddEven()
	{
		int countOdd=0;
		int countEven=0;
		for(int i=1;i<=100;i++)
		{
			if( i%2==0)
			countEven++;			
			else
			countOdd++;
		}
		
		System.out.println("Even Count: " +countEven);
		System.out.println("Odd Count: " +countOdd);
	}
	public static void main(String[] args)
	{
		OddEven();

	}

}
