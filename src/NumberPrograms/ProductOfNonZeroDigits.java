package NumberPrograms;

public class ProductOfNonZeroDigits {
	public static int productOfDigits(int n) {
        int product = 1;       
        int temp = n; 
        if (temp < 0) {
            temp = Math.abs(temp);
        }
        if (temp == 0) {
            return 1;
        }
        while (temp != 0) {
            int digit = temp % 10;
            if (digit != 0) {
                product *= digit;
            }
            temp /= 10;
        }       
        return product;
        }
	
	public static void main(String[] args)
	{
		System.out.println(productOfDigits(12789));
		System.out.println(productOfDigits(130407));
	}



}
