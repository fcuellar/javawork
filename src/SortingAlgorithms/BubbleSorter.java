package SortingAlgorithms;
import java.util.Scanner;
public class BubbleSorter {

	static void bubbleSorter(double[]data) {
		
		int n=data.length;
		double temp;
		int counter=0;
		boolean swapped = false;
		for(int i=0;i<n-1;i++) {
			swapped=false;
			for(int j=0;j<n-1-i;j++) {
				if(data[j]>data[j+1]) {
					temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
					swapped=true;
				}
				System.out.println(counter++);
			}
			if(swapped==false) {
				break;
			}
			
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double []data=new double[4];
		
		for(int i=0;i<data.length;i++) {
			System.out.printf("Enter a number to sort, you have %d remaining inputs\n",10-i);
			data[i]=input.nextDouble();
		}
		System.out.println("Sorting.....");
		bubbleSorter(data);
		for(int i =0;i<data.length;i++) {
			System.out.printf("%.1f ",data[i]);
		}
		
	}

}
