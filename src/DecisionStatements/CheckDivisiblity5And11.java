package DecisionStatements;

public class CheckDivisiblity5And11 {
	public static void CheckDivisibilty(int a)
	{
		if(a%5==0 && a%11==0)
		{
			System.out.println(a+ " Divisible by both 5 and 11");
		}
		else if(a%5==0 )
		{
			System.out.println(a+ " divisible by 5 only");
		}
		else if(a%11==0 )
		{
			System.out.println(a+ " divisible by 11 only");
		}
		else
		{
			System.out.println(a+ " not divisible by both 5 and 11");
		}

	}
	public static void main(String[] args)
	{
		CheckDivisibilty(50);
		CheckDivisibilty(22);
		CheckDivisibilty(55);
		CheckDivisibilty(3);
	}


}
