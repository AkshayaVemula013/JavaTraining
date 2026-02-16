package NumberPrograms;

public class NthPrime {
	
		public static boolean isPrime(int num) {
			if (num <= 1) return false;
			for(int i=2;i<num;i++)			
			{
				if(num%i==0) return false;	
			}
			return true;
	    }
		
		public static int nthPrime(int n) {
			int prime=0;
			int count=0;
			int i=2;
			while (count!=n){
				if(isPrime(i)) {
					count++;
					prime=i;
				}
				i++;
		}
			return prime;
		}
		public static void main(String[] args)
		{
			System.out.println(nthPrime(2));
			System.out.println(nthPrime(5));
		}

	}



