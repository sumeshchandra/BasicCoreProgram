import java.util.Scanner;

public class Harmonic {

	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=s.nextInt();
		double val=0.0;
		if(n<=0){
			System.out.println("The number should be greater than Zero");

		} else {
			for(int i=1;i<=n;i++)
				val=val+(1.0/i);
			System.out.println("The Nth Harmonic Value is : "+val);
		}

	}
}
