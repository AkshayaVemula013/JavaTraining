package DecisionStatements;

public class GradingSystem {
	public static String Grade(int marks)
	{
		if(marks>90 && marks<=100) return "A";
		
		else if(marks>80 && marks<=90) return "B";
			
		else if(marks>70 && marks<=80) return "C";
			
		else if(marks>60 && marks<=70) return "D";
			
		else if(marks>50 && marks<=60) return "E";
			
		else if(marks>40 && marks<=50) return "PASS";
			
		return("FAIL");
	}
	public static void main(String[] args)
	{
		System.out.println(Grade(97));
		System.out.println(Grade(87));
		System.out.println(Grade(77));
		System.out.println(Grade(67));
		System.out.println(Grade(57));
		System.out.println(Grade(47));
		System.out.println(Grade(37));
		
	}

	
}
