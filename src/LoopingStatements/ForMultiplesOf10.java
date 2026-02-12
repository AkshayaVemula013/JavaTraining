package LoopingStatements;

public class ForMultiplesOf10 {
	public static void MultiplesOf10()
	{
		int count=0;
		for(int i=100;i>=-100;i--)    //for(int i=100;i>=-100;i-=10) --> no need for all the %10 stuff directly decrease 10 

		{
			if(i==0) continue;
			if(i%10==0)				//if( i%10==0 && i!=0) 
			{							
			System.out.println(i);
			count++;
			}
		}
		System.out.println("Count is " +count);
	}
	public static void main(String[] args)
	{
		MultiplesOf10();
	}

}
