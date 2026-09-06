//Check whether the user given number is divisible by 2,5 and 10
import java.util.Scanner;
class DivisibleChecker{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int number = sc.nextInt();

		System.out.println(number);

		if(number%2==0 && number%5==0 && number%10==0){
			System.out.println(number+ " Is divisible by 2,5 and 10");
		}else{
			System.out.println(number+ " Is not divisible by 2,5 and 10");
		}
	}
}
