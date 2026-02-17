package NumberPrograms;

public class EmirpNumber {
	public static String emirp(int n){
		int reverse=0;
		int tempNum=n;
		while (tempNum != 0) {
	        int digit = tempNum % 10;      
	        reverse = reverse * 10 + digit; 
	        tempNum = tempNum / 10; 
	    }
		if(n!=reverse && isprime(n) && isprime(reverse)){
			return "Emirp";
		}
		else{
			return "Not Emirp";
		}
	}
	public static boolean isprime(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		System.out.println(emirp(17));
		System.out.println(emirp(23));
		System.out.println(emirp(13));

	}

}
