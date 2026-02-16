package NumberPrograms;

public class ReverseNumber {
	public static int reverseDigits(int num) {
		int rev=0;
        while(num!=0)
		{
			int LastDigit = num%10;
			rev=rev*10+LastDigit;
			num=num/10;
		}
        return rev;
        }
	
	public static void main(String[] args)
	{
		System.out.println(reverseDigits(650));
		System.out.println(reverseDigits(12345));
	}

}
