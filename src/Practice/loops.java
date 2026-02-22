package Practice;

public class loops {
	// sum of digits
	
	public static int Largest(int num)
	{
		int max=num%10;
		int LD;
		while(num>0)
		{
			LD=num%10;
			if (LD>=max) max=LD;
			num=num/10;
		}
		return max;
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println(Largest(1234));
	}

}
