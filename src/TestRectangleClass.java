
public class TestRectangleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleClass r1=new RectangleClass();
		RectangleClass r2=new RectangleClass(3.0,5.5);
		
		double area1=r1.getArea();
		double per1=r1.getPerimeter();
		
		double area2=r2.getArea();
		double per2=r2.getPerimeter();
		
		System.out.printf("area: %f perimeter: %f\n",area1,per1);
		System.out.printf("area: %f perimeter: %f\n",area2,per2);

		
		

	}

}
