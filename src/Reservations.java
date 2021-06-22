
public class Reservations {
	String room;
	int day;
	static int nReservations=0;
	final static String[] dayName= {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
	Reservations(String newRoom, int newDay){
		room = newRoom;
		day = newDay;
		nReservations++;
	}
	
	void show() {
		System.out.printf("Room %s reserved on day %s.\n",room,dayName[day]);
	}
	
	static void showNReservations() {
		System.out.printf("Number of Reservations %d\n", nReservations);
	}
	
	void testStatic() {
		System.out.println(nReservations);
		showNReservations();
	}

}
