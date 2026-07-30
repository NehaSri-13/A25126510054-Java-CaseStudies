package Assignments;
import java.util.Scanner;
public class TrafficSignalAssistant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter signel colour");
		String colour=sc.nextLine();
		switch(colour)
		{
		case "red":System.out.println("STOP");
		           break;
		case "yellow":System.out.println("READY");
                   break;
		case "green":System.out.println("GO");
                   break;
		           
		}
		sc.close();
	}

}
