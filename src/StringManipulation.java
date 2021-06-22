import java.util.Scanner;
public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String message="Welcome to Java";
		String upperMessage=message.toUpperCase();
		System.out.println(upperMessage);
		String lowerMessage=upperMessage.toLowerCase();
		System.out.println(lowerMessage);
		
		String username="    \t Frankie";
		System.out.println(username.trim());
		
		String test="Flashpoint";
		System.out.println(test.equals(username));
		System.out.println("Enter a user choice");
		String userChoice = input.nextLine();
		if (userChoice.equalsIgnoreCase("hello")){
				System.out.println("this ignore case works");
		
		}
		
		System.out.println("Welcome to String Parser Enter 3 Strings with Commas");
		String phrase=input.nextLine();
		String s1="";
		String s2="";
		String s3="";
		
		int Comma=phrase.indexOf(',');
		if(Comma>=0) {
			s1=phrase.substring(0,Comma);
		}
		
		
		//System.out.println(s1 + s2 + s3);
		/*
		 * while(phrase.indexOf(',')>=0 || phrase.length()>=1) {
		 * 
		 * s1=phrase.substring(0,phrase.indexOf(',')); System.out.println(s1);
		 * phrase=phrase.substring(phrase.indexOf(',')+1,phrase.length()); }
		 */
		int fractal =0;
		int sum=1;
		System.out.println("Enter a number to find its fractal");
		fractal=input.nextInt();
		while(fractal>0) {
			sum*=fractal;
			fractal--;
			
		}
		System.out.println(sum);
		
		
		
	}

}
	
