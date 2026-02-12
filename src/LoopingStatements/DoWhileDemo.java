package LoopingStatements;

import java.util.Scanner;

public class DoWhileDemo {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		do {
			System.out.println("Welcome");
			System.out.println("Press Y/y if you want to print it again");
			ch=sc.next().charAt(0);
		}
		while(ch=='Y' || ch=='y');
		System.out.println("Thank You");

	}
}
