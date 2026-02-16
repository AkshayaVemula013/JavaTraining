package DecisionStatements;

public class VowelOrConsonant {
	public static String CheckVowelOrConsonant(char ch)
	{
		if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' )
		{
			return ("It is vowel");
		
		}
		
			return ("It is a Consonant");
		
	}
	public static void main(String[] args)
	{
		System.out.println(CheckVowelOrConsonant('a'));
		System.out.println(CheckVowelOrConsonant(('f')));
		System.out.println(CheckVowelOrConsonant('O'));
		System.out.println(CheckVowelOrConsonant(('D')));

	}
}
	
