import java.util.Scanner;

public class SwapTwoNo {

	public static void main(String[] args) {
		int a,b,c;
	     Scanner s=new Scanner(System.in);
	     	System.out.print("enter the value of a and b : ");
			     a=s.nextInt();
			     b=s.nextInt();
			     c=a;
			     a=b;
			     b=c;

			     System.out.println("After swapping: " +a+" "+b);
	}

}
