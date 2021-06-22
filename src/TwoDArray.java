
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][]sales= {
				{10,11,12,13},
				{14,15,16,17},
				{18,19,20,21}
		};
		System.out.println("Length of sales is " + sales.length);
		System.out.println("Number of cols in row zero " + 
		sales[0].length);
		
		double grandTotal=0.0;
		double yearlyTotal=0.0;
		final int BASE_YEAR=2016;
		for(int row=0;row<sales.length;row++) {
			for(int col=0;col<sales[row].length;col++) {
				grandTotal=grandTotal+sales[row][col];
				
			}
		}
		for(int row=0;row<sales.length;row++) {
			yearlyTotal=0.0;
			for(int col=0;col<sales[row].length;col++) {
				yearlyTotal+=sales[row][col];
			}
			System.out.println("Yearly Total is: "+(BASE_YEAR+row)+ ": "+ yearlyTotal);
		}
		for(int col=0;col<sales[0].length;col++){
			double quarterlyTotal=0.0;
			for(int row=0;row<sales.length;row++) {
				quarterlyTotal+=sales[row][col];
				
			}
			System.out.println("Quarterly Total is Q" + (col+1)+ ": "+ quarterlyTotal);

			
		}
		
		System.out.printf("Grand total is %.2f\n",grandTotal);

	}

}
