
public class EventClient {

	public static void main(String[] args) {

		// Create an Event object
		Event event = new Event();
		
		// Call methods on it
		event.begin();
		event.provideSnacks("Apples");
		
		// Call a method that returns a value
		int total = event.getAttendanceTotal(10, 8);
		System.out.println("EventClient: The attendance is " + total);
		
		// end the event
		event.endTheEvent();
		
	}

}
