package Assignments;
import java.util.Scanner;
import java.util.Arrays;
public class SmartStudentResultManagementSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student Name");
		String name=sc.nextLine();
		System.out.println("Enter student Roll no ");
		int roll=sc.nextInt();
		System.out.println("Enter no of subjects");
		int n=sc.nextInt();
		String[] sub=new String[n];
		int[] marks=new int[n];
		int total=0;
		for(int i=0;i<n;i++) {
			System.out.println("Enter subject name");
			sc.nextLine();
			sub[i]=sc.nextLine();
			System.out.println("Enter marks");
			marks[i]=sc.nextInt();
			total=total+marks[i];
		}
		int avg=total/n;
		System.out.println("----------------------------");
		System.out.println("       Student Report");
		System.out.println("----------------------------");
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+roll);
		System.out.println("----------------------------");
		System.out.println("Subject        Marks");
		for(int i=0;i<n;i++) {
			System.out.printf("%-15s%d%n",sub[i],marks[i]);
		}
		System.out.println("----------------------------");
		System.out.println("Average: "+avg);
		if(avg>=90) {
			System.out.println("Grade: A");
			System.out.println("Passed");
			}
		else if(avg<90 && avg>=80) {
			System.out.println("Grade: B");
			System.out.println("Passed");
			}
		else if(avg<80 && avg>=70) {
			System.out.println("Grade: C");
			System.out.println("Passed");
			}
		else if(avg<70 && avg>=60) {
			System.out.println("Grade: D");
			System.out.println("Passed");
		}
		else if(avg<60) {
			System.out.println("Grade: F");
			System.out.println("Failed");}
   Arrays.sort(marks);
   System.out.println("Highest mark: "+marks[n-1]);
   sc.close();



	}

}
