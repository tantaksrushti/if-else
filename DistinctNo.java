//To find the maximum between two distinct numbers 
import java.util.Scanner;
class MaxDistinctChecker{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number 1: ");
		int num1 = input.nextInt();

		System.out.println("Enter number 2: ");
		int num2 = input.nextInt();

		System.out.println(num1);
		System.out.println(num2);

		if(num1>num2){
			System.out.println(num1 + " is maximum between " + num2 + " , " + num1);
		}else{
			System.out.println(num2 + " is maximum between  " + num1 + " , " + num2);
		
		}
	}
}
