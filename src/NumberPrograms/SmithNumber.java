//composite number whose sum of digits = sum of digits of prime factors
//666 --->>  prime factors = 2,3,3,37   LHS = 6+6+6 = 18    RHS = 2+3+3+(3+7)
package NumberPrograms;

public class SmithNumber {

    public static boolean isSmith(int num)
    {
        if(isPrime(num))                           //composite
            return false;

        int LHSsum = SumOfDigits(num);                  // LHS sum
        int sum = 0;                                  // RHS
        int i = 2;

        while(num != 1)
        {
            if(num % i == 0)
            {
                sum += SumOfDigits(i);
                num /= i;
            }
            else
                i++;
        }

        return LHSsum == sum;
    }

    public static int SumOfDigits(int num)
    {
        int sum = 0;
        while(num != 0)
        {
            sum += (num % 10);
            num = num / 10;
        }
        return sum;
    }

    public static boolean isPrime(int num)
    {
        if(num <= 1) return false;

        for(int i = 2; i < num; i++)
        {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(isSmith(666)); 
        System.out.println(isSmith(83));  
    }
}
