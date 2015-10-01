
class CalculatorClient {

	public static void main(String[] args) {
		
		// create a Calculator object
		Calculator calc = new Calculator();

		// test arithmetic
		// ---------------
		int x = 4;
		float y = 5.5f;

		// calculations
		double result = calc.add(x, y);
		System.out.println(x + " + " + y + " = " + result);

		result = calc.subtract(x, y);
		System.out.println(x + " - " + y + " = " + result);

		result = calc.multiply(x, y);
		System.out.println(x + " * " + y + " = " + result);

		result = calc.divide(x, y);
		System.out.println(x + " / " + y + " = " + result);

		// test integer division
		// ---------------------
		byte b = 14;
		long intDivResult = calc.integerDivide(b, x);
		System.out.println(b + " integer-divide " + x + " = " + intDivResult);

		// test string length
		// ------------------
		String str = "Seattle";
		
		str.length();
		
		
		System.out.println("the string " + str + " has length = "
				+ calc.returnStringLength(str));

		// test number compare
		// -------------------
		short r = 4;
		float s = 99.456F;
		System.out.println(r + " is greater than " + s + "? "
				+ calc.numberCompare(r, s));

		// try equal numbers
		int t = 5, u = 5; // can declare multiple variables at once (BAD)
		System.out.println("5 is greater than 5? " + calc.numberCompare(t, u));
	}
}
