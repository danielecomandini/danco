package utils;

public class PrimaryNumber {

	/**
	 * Returns true if the number in input is prime. Prime means that it can be devided for 1 and for itself only.
	 * @param number The number.
	 * @return True or false.
	 */
	public static boolean isPrimaryNumber(int number) {
		if( number <= 3 ) {
			return true;
		} else if( number % 2 == 0 ) {
			return false;
		} else {
			int div = 3;
			for( int i=div; i<number/2; i++ ) {
				if( number % i == 0 ) {
					return false;
				}
			}
			return true;
		}
	}
	
}
