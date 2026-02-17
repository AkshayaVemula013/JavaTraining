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



/*public class Solution{ 
public static String emirp(int n){
	int reverse=0;
	int tempNum=n;
	while (tempNum != 0) {
        int digit = tempNum % 10;      
        reverse = reverse * 10 + digit; 
        tempNum = tempNum / 10; 
    }
	boolean res2=isprime(reverse);
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
}*/