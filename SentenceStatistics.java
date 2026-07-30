package Assignments;
import java.util.Scanner;
public class SentenceStatistics {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		System.out.println("Number of words: "+s1.length);
		char[] ch=s.toCharArray();
		int vowel=0;
		int consonent=0;
		int space=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
				vowel++;
			else if(ch[i]==' ')
				space++;
			else
				consonent++;
		}
		System.out.println("No of vowels: "+vowel);
		System.out.println("No of consonents: "+consonent);
		System.out.println("No of spaces: "+space);

		sc.close();


	}

}
