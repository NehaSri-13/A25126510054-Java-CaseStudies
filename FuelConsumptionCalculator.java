package Assignments;
import java.util.Scanner;
public class FuelConsumptionCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter distance travelled(in KM)");
		double distance=sc.nextDouble();
		System.out.println("Enter fuel consumed(in L)");
		double fuel=sc.nextDouble();
		System.out.printf("Mileage:%.2f%n",(distance/fuel));

		sc.close();
	}

}
