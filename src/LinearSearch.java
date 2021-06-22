import java.util.Scanner;
public class LinearSearch {
	
	public static int linearSearch(int[]data,int value) {
		for(int i=0;i<data.length;i++) {
			if(data[i]==value) {
				return i;
			}
		}
		return -1;
	}
	
	public static int linearSearchWLoop(int []data, int value) {
		int position=0;
		while(position<data.length && (data[position]!=value)) {
			position++;
		}
		return((position<data.length)?position:-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[]data= {2,4,6,8,10,20,30,40,80,55};
		int a=0;
		do {
		System.out.println("Enter an int to see if its in the data");
		a=input.nextInt();
		int found=linearSearchWLoop(data,a);
		System.out.printf("Value %d found at index %d\n",a,found);
		
		}while(a!=0);

	}

}
