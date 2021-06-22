import java.util.Scanner;
public class BinarySearch {
	
	
	public static int binarySearch(int data[],int key) {
		int low=0;
		int high=data.length-1;
		int mid=(low+high)/2;
		while(low<=high) {
			if(data[mid]==key) {
				return mid;
			}
			else if(data[mid]>key) {
				high=mid-1;
				mid=(low+high)/2;
			}
			else {
				low=mid+1;
				mid=(low+high)/2;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]data= {2,3,4,5,6,7,8,9,10,20,30,40};
		Scanner input= new Scanner(System.in);
		
		int key=0;
		do {
			System.out.println("Enter an integer for binary search or 0 to quit");
			key=input.nextInt();
			int result=binarySearch(data,key);
			System.out.println("Found at "+result);
		}
		while(key!=0);

	}

}
