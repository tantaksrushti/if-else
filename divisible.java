//to check whether the number given by the user is divisible by 7or not 
import java.util.Scanner; //imports Scanner class 
class DivisibleChecker{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		System.out.println(num);

		if(num%7==0){
			System.out.println(num+" Is divisible by 7");
		} else {
		        System.out.println(num+ " Is not divisible by 7");
		}
	}
}	
