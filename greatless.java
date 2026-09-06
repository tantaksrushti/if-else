// number less then or greater then 10
import java.util.*;
class greatlessDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		if(num<10){
			System.out.println("The number is less then 10");
		} else if(num==10){
			System.out.println("The number is equal to  10");
		} else{
			System.out.println("The number is greater then 10");
		}
	}
}
