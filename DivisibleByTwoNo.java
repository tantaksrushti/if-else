//Check whether the given number is divisible by 3 and 7 or not 
import java.util.Scanner;
class TwoDivisibleChecker{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		System.out.println(num);

		if(num%3==0 && num%7==0){
			System.out.println(num+ " Is divisible by both 3 and 7");
		}else if(num%3==0){
			System.out.println(num+ " Is divisible by 3");
		} else if(num%7==0){
			System.out.println(num+ " Is divisible by 7");
		}else{
			System.out.println(num+ " Is nither divisible by 3 nor by  7");
		}
	}
}
