import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Hello World");
		System.out.println("Enter your age: \n");
		int age = input.nextInt();
		int days = age*365;
		System.out.format("This is about %d days \n", days);
		
		
		System.out.println("Enter a price");

		double price=input.nextDouble();
		double discount = price*0.85;
		System.out.format("Price %.2f with discount is %.2f \n", price,discount);
		
		if(age%2==0 && age<65) {
			System.out.println("Age is even and you are young");
		}
		
		else if(age>60 && age%2!=0) {
			System.out.println("You are a senior with an odd age");
		}
		else {
			System.out.println("Age is odd and you aren't a senior");
		}
		
		switch(age) {
		case (20):	System.out.format("Age %d younger via switch\n", age );
						break;
		default:	System.out.println(" default switch");
						
		}
		
		int randomAge=(int)(18+Math.random()*(66-18));
		System.out.format("Random age of %d\n",randomAge);
		
		System.out.println("Random Age Squared is: "+ Math.pow(randomAge,2));
	}

}
