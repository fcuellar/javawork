
public class MaxNumMethod {

	public static int maxNum(int... numbers) {
		int maximum=numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>maximum) {
				maximum=numbers[i];
			}
			
		}
		return maximum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxNum(3,4,5,6,7,8,10,50));
		
		int[]data= {3,4,19,20,30};
		System.out.println(maxNum(data));
	}

}
