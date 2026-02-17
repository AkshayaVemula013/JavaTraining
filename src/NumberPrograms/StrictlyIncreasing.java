package NumberPrograms;

public class StrictlyIncreasing {
	public static boolean isIncreasing(int num) {
		int previousDigit = 10;
        
        while (num > 0) {
            int currentDigit = num % 10;
            if (currentDigit >= previousDigit) 
            {
                return false;
            }
            previousDigit = currentDigit;
            num /= 10;
        }
        return true;

	}
	public static void main(String[] args)
	{
		System.out.println(isIncreasing(1234));
		System.out.println(isIncreasing(1673));
	}



}
