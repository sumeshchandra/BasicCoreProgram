import java.util.Scanner;

	public class LargestAmongThree {

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int num1,num2,num3;

			System.out.print("Enter Num1: ");
			num1=Utility.getUserInteger();
			
			System.out.print("Enter Num2: ");
			num2=Utility.getUserInteger();
			
			System.out.print("Enter Num3: ");
			num3=Utility.getUserInteger();
			
			if( num1 >= num2 && num1 >= num3)
			
				System.out.println(num1+" is the largest Number");
			else if (num2 >= num1 && num2 >= num3)
			
				System.out.println(num2+" is the largest Number");
			else
				System.out.println(num3+" is the largest Number");
		}
	}