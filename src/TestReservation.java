
public class TestReservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reservations r1=new Reservations("SA114",0);
		Reservations r2=new Reservations("A4134",3);
		r1.show();
		r2.show();
		Reservations.showNReservations();
	}

}
