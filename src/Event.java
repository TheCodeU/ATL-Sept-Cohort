public class Event {

	void begin() {
		System.out.println("The event has begun!");
	}

	void endTheEvent() {
		System.out.println("The event has ended.");
	}

	void provideSnacks(String snack) {
		System.out.println("If you are hungry we have " + snack + "!!");
	}

	int getAttendanceTotal(int women, int men) {
		// Display from inside the method
		System.out.println("There are " + women + " Women and " + men
				+ " Men.");
		// Return the value
		int result = women + men;
		return result;
	}
}
