
public class RectangleClass {
	double width;
	double height;
	RectangleClass(){
		width=1.0;
		height=1.0;
	}
	RectangleClass(double w, double h){
		width=w;
		height=h;
	}
	
	double getArea() {
		return width*height;
	}
	double getPerimeter() {
		return 2.0*(width+height);
	}
	
}
