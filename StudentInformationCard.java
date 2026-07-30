package Assignments;
import java.util.Scanner;
public class StudentInformationCard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student details");
		System.out.print("Enter student name: ");
		String n=sc.nextLine();
		System.out.print("Enter student regd.no: ");
		String id=sc.nextLine();
		System.out.print("Enter student aadhaar no: ");
		long aadhaar=sc.nextLong();
		System.out.print("Enter student moblie no: ");
		long moblie=sc.nextLong();
		System.out.println("-------Student Id Card-------");
		System.out.println("Name: "+n);
		System.out.println("Regd.No: "+id);
		System.out.println("Aadhaar No: "+aadhaar);
		System.out.println("Moblie No: "+moblie);
		sc.close();
	}

}
