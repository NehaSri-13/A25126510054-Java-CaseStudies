package Assignments;
import java.util.Scanner;
public class WaterIntakeTracker {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int liters;
	double total=0;
	for(int i=1;i<8;i++) {
	System.out.println("Enter no.of liters taken on day "+i+" in liters: ");
	liters=sc.nextInt();
	total=total+liters;
	}
	System.out.println("total water consumption:"+total+" liters");
	System.out.println("average water consumption:"+total/7+" liters");
	sc.close();
	}

}
