package NumberPrograms;

public class TwinPrimes {
	public  static String twinPrime(int a, int b) {
		int diff=a-b;
		if(isPrime(a)==true && isPrime(b)==true && Math.abs(diff)==2)
		{
			return "Twin Primes";
		}
        return "Not Twin Primes";
    }
	public static boolean isPrime(int num)
	{
		for(int i=2; i<Math.sqrt(num);i++)
		{
			if(num%i==0) return false;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		System.out.println(twinPrime(13,15));
		System.out.println(twinPrime(11,13));
	}

}
