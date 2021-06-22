import java.util.Scanner;
public class BinarySearchRecursive {
	
	public static int binarySearch(int[]data,int value, int low, int high) {
		int mid=(low+high)/2;
		if(data[mid]==value) {
			return mid;
		}
		else if(low<high) {
			if(data[mid]<value) {
				low=mid+1;
				return binarySearch(data,value,low,high);
			}
			else {
				high=mid-1;
				return binarySearch(data,value,low,high);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []data= {2,4,6,8,10,12,14,17,20};
		Scanner input=new Scanner(System.in);
		int value=0;
		do {
			System.out.println("Enter an integer to search in binary");
			value=input.nextInt();
			int location=binarySearch(data,value,0,data.length-1);
			
			System.out.printf("The index of the value %d in data is %d\n",value, location);
		}while(value!=0);
	}

}
