package NumberPrograms;

public class SeperatingDigits {
	public static void main(String[] args)
	{
		int num=1234567890;
		while(num!=0)
		{
			int LastDigit = num%10;
			System.out.println(LastDigit);
			num=num/10;
		}	
	}
}
