import java.util.Scanner;



public class GetTotalMethod {
	

	public static double getTotal(int quantity, double price) {
		
		double result=quantity*price-(quantity*price*0.30);
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int quantity;
		double price;
		System.out.println("Enter the quantity and price of an item to calculate its total with a discount of 30%");
		quantity=input.nextInt();
		price=input.nextDouble();
		double result=getTotal(quantity, price);
		System.out.format("The total with discount is %.2f", result);
	}

}
