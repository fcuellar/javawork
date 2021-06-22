package OOP;

public class ToasterTest{
	public static void main(String[] args) {
		Toaster twoSlot=new Toaster(2,110);
		Toaster euroFour=new Toaster(4,220);
		twoSlot.turnOn();
		twoSlot.setDarkness(4);
		twoSlot.insertBread(5);
		
	
		System.out.println(twoSlot);
		
		System.out.println(euroFour);
		
		
	}
}