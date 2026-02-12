package LoopingStatements;

public class ForMultiplesOf3 {
	public static void Multiples(int a)
	{
		int count=0;
		for(int i=0;i<=100;i++)
		{
			if( i%a==0) {
			System.out.println(i);
			count++;
			}
		}
		
		System.out.println("Count is " +count);
	}
	public static void main(String[] args)
	{
		Multiples(3);

	}


}
