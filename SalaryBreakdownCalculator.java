package Assignments;
import java.util.Scanner;
public class SalaryBreakdownCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter gross salary:");
		double grossSalary=sc.nextDouble();
		System.out.println("Enter PF:");
		double PF=sc.nextDouble();
		System.out.println("Enter income tax amount:");
		double incomeTax=sc.nextDouble();
		double deduction=PF+incomeTax;
		double netSalary=grossSalary-deduction;
		System.out.println("Net salary: "+netSalary);
		sc.close();

	}

}
