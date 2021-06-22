import java.util.Scanner;
public class FactorialDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to find it's factorial");
		int num = input.nextInt();
		int sum=1;
		
		do {
			if(num==0) {
				break;
			}
			else {
				sum*=num;
				num--;
				
			}
			
			
		}while(num>0);
		System.out.format("The Final Result is %d", sum);

	}

}
