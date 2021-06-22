import java.util.Scanner;
public class MethodOverloadExample {
	
	
	public static int maxNum(int a, int b)
	{
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public static double maxNum(double a, double b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public static int maxNum(int a, int b, int c) {
		if (a>b) {
			return maxNum(a,c);
		}
		else {
			return maxNum(b,c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 integers to find their max");
		int a=input.nextInt();
		int b=input.nextInt();
		
		System.out.println(maxNum(a,b));
		
		System.out.println("Enter two doubles to find their max");
		double ax=input.nextDouble();
		double bx=input.nextDouble();
		System.out.println(maxNum(ax,bx));
		
		System.out.println("Enter three integers to find their max");
		a=input.nextInt();
		b=input.nextInt();
		int c=input.nextInt();
		
		System.out.println(maxNum(a,b,c));
	}

}
