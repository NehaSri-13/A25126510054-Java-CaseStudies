package Assignments;
import java.util.Scanner;
public class ATMCashWithdrawalValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter current balance");
		double cb=sc.nextDouble();
		System.out.println("Enter withdrawal amount");
		double wa=sc.nextDouble();
		double min=1000;
		double finalAmount=cb-wa;
		if(finalAmount>min) 
			System.out.println("Withdrawal successfuly!");
		else
			System.out.println("No sufficient balance");
		sc.close();
		
		

	}

}
