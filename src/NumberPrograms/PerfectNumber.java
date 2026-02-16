package NumberPrograms;

public class PerfectNumber {
	public static String CheckPerfect(int num)
	{
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0) sum+=i;	
		}
		
		if(num==sum)return "It is a Pefect number!! :D";
		
		return "It is not a Happy number :C";
	}	
	public static void main(String[] args)
	{
		System.out.println(CheckPerfect(6));
		System.out.println(CheckPerfect(45));
	}
		

}
