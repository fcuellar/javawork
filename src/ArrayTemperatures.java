import java.util.Scanner;
public class ArrayTemperatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[]temperatures=new double[10];
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter 10 temperatures");
		for (int i=0;i<temperatures.length;i++) {
			temperatures[i]=input.nextDouble();
			
		}
		
		double sum=0;
		for(int i=0;i<temperatures.length;i++) {
			sum=sum+temperatures[i];
		}
		double average=sum/temperatures.length;
		
		//Finding days above and below average
		int aAverage=0;
		int bAverage=0;
		
		for(int i=0;i<temperatures.length;i++) {
			if(temperatures[i]>=average) {
				aAverage++;
			}
			else {
				bAverage++;
			}
		}

		System.out.format("The total is %.2fC\n", sum);
		System.out.format("The average is %.2fC\n", average);
		System.out.format("Total days above average are %d\n "
				+ "and total below average are %d", aAverage,bAverage);
		
	}

}
