import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a Letter : ");
		char ch=s.nextLine().charAt(0);
		if(ch=='a'||ch == 'e'||ch =='i'||ch=='o'||ch=='u'||
				ch=='A'||ch == 'E'||ch =='I'||ch=='O'||ch=='U')
		
			System.out.println(ch + " is vowel");
		else
		
			System.out.println(ch + " is consonant");
	}
}
