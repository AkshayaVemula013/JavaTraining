package NumberPrograms;

public class Factorial {
	public static long factorial(int n) {
        long fact=1;
		for(int i=2;i<=n;i++) {
			fact*=i;
		}
		return fact; 
    }
	
	public static void main(String[] args)
	{
		System.out.println(factorial(6));
		System.out.println(factorial(3));
	}

}
