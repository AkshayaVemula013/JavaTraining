package NumberPrograms;

public class SumOfEvenFactors {
	public static int sumOfEvenFactors(int num) {
        int sum=0;
        for(int i=2;i<=num;i+=2)
        {
            if (num%i==0) sum+=i;
        }
        return sum;
    }
	public static void main(String[] args)
	{
		System.out.println(sumOfEvenFactors(12));
		System.out.println(sumOfEvenFactors(13));
	}

}
