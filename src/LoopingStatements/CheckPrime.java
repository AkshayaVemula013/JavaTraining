package LoopingStatements;

import java.util.Scanner;

public class CheckPrime {
	public static boolean prime(int num)
	{
		
		if (num <= 1) return false;
		for(int i=2;i<num;i++)			//		for(int i=2;i<num/2;i++) or for(int i=2;i<Math.sqrt(num);i++)


		{
			if(num%i==0) return false;
				
		}
		return true;
	}
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
		    System.out.print("Enter number: ");
		    int n = sc.nextInt();
		    if (prime(n))
		    	System.out.println("Prime");
		    else
		        System.out.println("Not Prime");
		}
}


