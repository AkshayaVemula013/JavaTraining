package DecisionStatements;
//import java.util.Scanner;

public class SwitchGrading {
	
	public static void CheckGrade(int marks)
	{
	
		if(marks<0 || marks>100) 
		{
			System.out.println("Invalid");
			return;
		}
	
		switch(marks/10)
		{
		case 9,10:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		case 5:
			System.out.println("E");
			break;
		case 4:
			System.out.println("PASS");
			break;
		case 3,2,1,0:
			System.out.println("FAIL");
			break;
		default: 
			System.out.println("Invalid");
		}
		
	}
	public static void main(String[] args)
	{
		CheckGrade (95);
		CheckGrade (85);
		CheckGrade (75);
		CheckGrade (65);
		CheckGrade (55);
		CheckGrade (45);
		CheckGrade (35);
		CheckGrade (25);
		CheckGrade (15);
		
	}

}

