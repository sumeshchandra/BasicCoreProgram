import java.util.Scanner;

	public class Powerof2{
		public static void main(String args[]){
			Scanner scanner=new Scanner(System.in);
			int n;
			System.out.print("Enter the number : ");
			n = scanner.nextInt();
			System.out.println("Power of 2 "+ n +"is : "+(Math.pow(2,n)));
			for(int i=1;i<=n;i++){
				System.out.println("Power of 2 "+ i +"is : "+(Math.pow(2,i)));
			}
		}
}