package Assignments;
import java.util.Scanner;
public class UsernameAvailabilityChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int flage=0;
		String[] names= {"neha","varshita","lakshita","rishita"};
		System.out.println("Enter Username: ");
		String s=sc.nextLine();
		for(int i=0;i<names.length;i++) {
			if(names[i].equalsIgnoreCase(s))
				{flage=1;
			     break;}
			
		}
		if(flage==1)
			System.out.println("User name all ready exists");
		else
			System.out.println("User name taken");
		sc.close();
		

	}

}
