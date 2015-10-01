/*
 * Lab 4.4: a basic Calculator.  Performs the following:
 * - arithmetic
 * - integer division
 * - string length
 * - number comparison
 * 
 */
class Calculator {

	static final int MAX_COUNT = 5;
	
	// Lab 4.4 methods
	/*
	 * Arithmetic operations. Works with doubles to support all numeric types.
	 */
	double add(double a, double b) {
		return a + b;
	}

	double subtract(double a, double b) {
		return a - b;
	}

	double multiply(double a, double b) {
		return a * b;
	}

	double divide(double a, double b) {
		return a / b;
	}

	/*
	 * Integer division -> result also integer. Works with longs to support all
	 * integer types.
	 */
	long integerDivide(long a, long b) {
		return a / b;
	}

	// returns length of the given string
	int returnStringLength(String str) {
		return str.length();
	}

	// returns true if 1st number is larger
	boolean numberCompare(double a, double b) {
		return (a > b);
	}
	
	// 6.2 lab 
	double sumNumbers(double[] args){
		double result = 0;
		for (double arg: args) {
			result += arg;
		}
		return result;
	}
	// 6.2 lab 
		int countValues(int[] numbers, int searchValue){
			int result = 0;
			for (int num: numbers) {
				if (result == MAX_COUNT){
					break;
				}
				if(num == searchValue){
					result++;
				}
			}
			return result;
		}
}
