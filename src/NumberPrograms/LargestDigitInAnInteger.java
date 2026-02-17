package NumberPrograms;

public class LargestDigitInAnInteger {
	public static int largestDigit(int n) {
        int maxDigit=0;
        while (n > 0)
        {
            int digit = n % 10;             
            if (digit > maxDigit) 
            {
                maxDigit = digit;
            }
            n = n / 10;
        }
        return maxDigit;
    }
	
	public static void main(String[] args)
	{
		System.out.println(largestDigit(12715));
		System.out.println(largestDigit(13120));
	}



}
