package Assignments;
import java.util.Scanner;
public class PrimeNumberIdentifier {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int flage=1;
		for(int i=2;i*i<n;i++) {
			if(n%i==0) {
				flage=0;
				System.out.println(n+" is not prime");
				break;
			}}
		if(flage==1)
			System.out.println(n+" is prime");
		sc.close();

	}

}
