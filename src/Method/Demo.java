package Method;

public class Demo {
	public static int add (int a, int b, int c) 
	{
		int res=0;
		res=a+b+c;
		return res; 
	}
	public static void print()
	{
		System.out.println("Hi");
		return;
	} 
	public static void main(String[] args)
	{
		int result=add(20,30,40);
		int update=add(20,30,40)+10;
		System.out.println(result);
		System.out.println(update);
	}
}
