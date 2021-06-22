import java.util.Scanner;
public class LeapYearCounterBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year;
		boolean finished=false;
		Scanner input = new Scanner(System.in);
		
		while(!finished) {
			System.out.println("Enter a year or 0 to quit");
			year=input.nextInt();
			if(year!=0) {
				if((year%4==0 && year%100!=0)||(year%400==0)) {
					System.out.format("%d is a Leap Year!\n", year);
				}
				else {
					System.out.println(year+ " is not a leap year!");
				}
			}
			else {
				finished=true;
			}
		}
		System.out.println("While loop exited");
	}

}
