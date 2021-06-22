import java.util.Scanner;
public class LeapYearCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year to figure out if its a leap year!");
		int year = input.nextInt();
		
		while (year!=0) {
			if((year%4==0 && year%100!=0)||(year%400==0)) {
				System.out.format("%d is a Leap Year!\n", year);
			}
			else {
				System.out.println(year+ " is not a leap year!");
			}
			System.out.println("Enter another year or 0 to quit");
			year=input.nextInt();
		}
		
		System.out.println("GoodBye!");

	}

}
