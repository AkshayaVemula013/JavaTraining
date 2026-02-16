package NumberPrograms;

public class HappyNumber {
	public static String CheckHappy(int num)
	{
		while(num!=1 && num!=4)
		{
			num=SumSq(num);
		}
		if(num==1)return "It is a Happy number!! :D";
		
		return "It is not a Happy number :C";
	}	
	public static int SumSq(int num)
	{
		int sum=0;
		while(num!=0)
		{
			int LD=num%10;
			sum += LD*LD;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		System.out.println(CheckHappy(32));
		System.out.println(CheckHappy(45));
	}
		

}
