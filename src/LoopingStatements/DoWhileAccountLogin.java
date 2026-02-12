package LoopingStatements;

import java.util.Scanner;

public class DoWhileAccountLogin {
	public static void main(String[] args)
	{
		int attempts=0;
		String pwd;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter password:");
			pwd=sc.next();
			
			if(pwd.equals("java123"))
			{
				System.out.println("Access Granted!!!");
				break;
			}
			else
			{
				System.out.println("Password Incorrect! Access Denied!!");	
				attempts++;
			}
		}
		while(attempts<3);
		if (attempts>=3)
		{
			System.out.println("Too mamy failed attempts! Account Locked!!");
		}		
	}
}
