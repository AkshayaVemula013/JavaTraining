package NumberPrograms;

public class SumOfPrimeInARange {

    public static int rangePrime(int i, int k){
        int sum = 0;
        if(i < 0 || k < 0) return 0;

        for(int j = i + 1; j < k; j++)
        {
            if(isPrime(j)) 
                sum += j;
        }
        return sum;
    }

    public static boolean isPrime(int num)
    {
        if(num <= 1) return false;

        for(int i = 2; i * i <= num; i++)
        {
            if(num % i == 0) 
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(rangePrime(12,15));
        System.out.println(rangePrime(13,20));
    }
}
