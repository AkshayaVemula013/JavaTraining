package Operators;

public class BankArithmetic {
	public static void main(String[] args) {
		int balance=500;
		System.out.println("initial balance = "+balance);


		balance=balance+500;
		System.out.println("balance after deposit of 500 = "+balance);

		balance=balance+200;
		System.out.println("balance after deposit of 200 = "+balance);

		balance=balance-150;
		System.out.println("balance after sending of 150 to a frnd = "+balance);
		
		System.out.println("final balance = "+balance);	
	    }

}
