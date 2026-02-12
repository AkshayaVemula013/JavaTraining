// multiplication table of a for b times

package LoopingStatements;

public class WhileMultiplicationTable {
	public static void Multiply(int a,int b) //no need for b jus give 10 
	{
		int i=1;
		while (i<=b)   //no need for b jus give 10 
		{
			int val=a*i;
			System.out.println(a +" * " +i +" = " +val);
			i++;
		}
	}
	public static void main(String[] args)
	{
		int a=5;
		int b=10;
		Multiply(a,b);
	}

}
