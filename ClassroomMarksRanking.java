package Assignments;
import java.util.Scanner;
import java.util.Arrays;
public class ClassroomMarksRanking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of students");
		int n=sc.nextInt();
		int[] marks=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter marks of student "+(i+1));
			marks[i]=sc.nextInt();
		}
		Arrays.sort(marks);
		System.out.println("--- Classroom marks details---");
		System.out.println("Topper Marks: "+marks[n-1]);
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+marks[i];
		}
		System.out.println("Average score: "+(sum/n));
		sc.close();

	}

}
