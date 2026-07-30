package Assignments;
import java.util.Scanner;
public class MultiplicationTableGenerator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for table");
		int n=sc.nextInt();
		for(int i=1;i<=20;i++) {
			int pro=n*i;
			System.out.println(n+"*"+i+"="+pro);
		}
		sc.close();
	}

}
