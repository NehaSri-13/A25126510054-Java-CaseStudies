package Assignments;
import java.util.Scanner;
public class BMIHealthChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weight in kg");
		double w=sc.nextDouble();
		System.out.println("Enter hight in m");
		double h=sc.nextDouble();
		double BMI=w/(h*h);
		if(BMI<18.5)
			System.out.println("Underweight");
		else if(BMI>=18.5 && BMI<25)
			System.out.println("Healthy Weight");
		else if(BMI>=25 && BMI<30)
			System.out.println("OverWeight");
		else if(BMI>=30)
			System.out.println("Obese");
		sc.close();
	}

}
