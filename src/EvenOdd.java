import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter any number : ");
		
		int n=scanner.nextInt();
		if(n%2==0){
		
			System.out.println("Number is Even");
		}else{
		
			System.out.println("Number is odd");}
	}

}