package Assignments;
import java.util.Scanner;
public class MobileRechargeCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter recharge amount: ");
		double rechargeAmount=sc.nextDouble();
		System.out.println("Enter GST percentage: ");
		double GSTpercentage=sc.nextDouble();
		System.out.println("Enter  validity period(in days): ");
		int validityPeriod=sc.nextInt();
		System.out.println("Enter current balance: ");
		double currentBalance=sc.nextDouble();
		double GSTamount=(rechargeAmount+GSTpercentage)/100;
		double finalAmount=rechargeAmount+GSTamount;
		double remainingAmount=currentBalance-finalAmount;
		if(remainingAmount>0) {
			System.out.println("----Mobile Recharge Bill----");
			System.out.println("Recharge amount:"+rechargeAmount);
			System.out.println("GST amount:"+GSTamount);
			System.out.println("Final payable amount:"+finalAmount);
			System.out.println("Validity period:"+validityPeriod+" days");
			System.out.println("Remaining balance:"+remainingAmount);
			sc.close(); 
		}
		else
			System.out.println("Insufficient balance!");
	}
}