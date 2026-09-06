//to check the day number(1-7) and print the corresponding day of week
import java.util.Scanner;
class WeekChecker{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number between 1 to 7: ");
		int number = input.nextInt();

		System.out.println(number);

		if(number==1){
			System.out.println("Monday");
		} else if(number==2){
			System.out.println("Tuesday");
		} else if(number==3){
			System.out.println("Wednesday");
		} else if(number==4){
			System.out.println("Thrusday");
		} else if(number==5){
			System.out.println("Friday");
		} else if(number==6){
			System.out.println("Saturday");
		} else if(number==7){
			System.out.println("Sunday");
		}
		else{
			System.out.println("Day number must be between 1 to 7!!!");
		}
	}
}
