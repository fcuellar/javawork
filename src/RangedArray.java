
public class RangedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]choices= {
				{9},
				{7,5},
				{4,6,1},
				{3,1,2,8}
		};
		
		int total=0;
		for(int row=0;row<choices.length;row++) {
			for(int col=0;col<choices[row].length;col++) {
				total+=choices[row][col];
			}
		}
		System.out.printf("Total number in the 2D Array is %d\n", total);
	}

}
