
public class CopyingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]ArrayA= {100,200,300};
		int[]ArrayB=ArrayA;
		
		ArrayB[1]=800;
		System.out.println(ArrayA[1]);
		//Arrays are reference types thus assigning ArrayB to ArrayA will copy its reference
		//Modifying ArrayB will change ArrayA
		
		
		//Option 1 of "copying" an array to another array
		int[]ArrayC=new int[3];
		for(int i=0;i<ArrayC.length;i++) {
			ArrayC[i]=ArrayA[i];
			
		}
		
		//Other option to copy arrays
		int[]ArrayD=new int[ArrayA.length];
		System.arraycopy(ArrayA, 0, ArrayD, 0, ArrayA.length);
		
	}

}
