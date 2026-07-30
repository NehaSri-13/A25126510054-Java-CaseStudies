package Assignments;
import java.util.Scanner;
public class RestaurantBillGenerator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter table no");
		int n=sc.nextInt();
		System.out.println("Enter no of items");
		int item=sc.nextInt();
		String[] food=new String[item];
		double[] price=new double[item];
		double total=0;
		for(int i=0;i<item;i++) {
			System.out.println("Enter item "+(i+1)+" name");
			sc.nextLine();
			food[i]=sc.nextLine();
			System.out.println("Enter item "+(i+1)+" price");
			price[i]=sc.nextInt();
			total=total+price[i];
		}
		System.out.println("----Total Bill--------");
		System.out.println("Table no: "+n);
		System.out.println("----------------------");
		System.out.println("Item name       Price ");
		System.out.println("----------------------");
		for(int i=0;i<item;i++) {
			System.out.printf("%-15s%.2f%n",food[i],price[i]);
		}
		System.out.println("----------------------");
		System.out.println("Total: "+total);
		sc.close();
	}

}
