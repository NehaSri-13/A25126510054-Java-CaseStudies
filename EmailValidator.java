package Assignments;
import java.util.Scanner;
public class EmailValidator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email id");
		String s=sc.nextLine();
		int len=s.length();
		String s2=s.substring(len-10,len);
		if(s2.equals("@gmail.com"))
			System.out.println("valid email id");
		else
			System.out.println("Invalid email id");
		sc.close();


	}

}
