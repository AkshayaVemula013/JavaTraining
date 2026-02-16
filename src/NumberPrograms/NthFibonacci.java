package NumberPrograms;

public class NthFibonacci {
	
	    public static int nthFibonacci(int n)
	    {
	        int a = 0;
	        int b = 1;

	        if(n == 1) return a;
	        if(n == 2) return b;

	        for(int i = 3; i <= n; i++)
	        {
	            int c = a + b;
	            a = b;
	            b = c;
	        }

	        return b;   // nth value
	    }

	    public static void main(String[] args)
	    {
	        System.out.println(nthFibonacci(1)); // 0
	        System.out.println(nthFibonacci(5)); // 3
	        System.out.println(nthFibonacci(10)); // 34
	    }
	}



