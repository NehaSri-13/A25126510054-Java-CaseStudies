package Assignments;
import java.util.Scanner;
import java.util.Arrays;
public class CricketScoreAnalyzer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of players");
		int n=sc.nextInt();
		int[] score=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter score of player "+(i+1));
			score[i]=sc.nextInt();
		}
		Arrays.sort(score);
		System.out.println("---Score details---");
		System.out.println("Highest score: "+score[n-1]);
		System.out.println("Least score: "+score[0]);
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+score[i];
		}
		System.out.println("Average score: "+(sum/n));
		sc.close();

	}

}
