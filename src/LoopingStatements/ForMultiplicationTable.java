package LoopingStatements;

public class ForMultiplicationTable {
	public static void Multiply(int a,int b) //no need for b jus give 10 
	{
		for(int i=1;i<=b;i++)  //no need for b jus give 10 
		{
			int val=a*i;
			System.out.println(a +" * " +i +" = " +val);
			
		}
	}
	public static void main(String[] args)
	{
		int a=5;
		int b=10;
		Multiply(a,b);
	}


}
