package utils;

public class BinaryUtils {

	/**
	 * Converts a number from decimal to binary.
	 * @param n The decimal.
	 * @return The binary.
	 */
	public static String integerToBinary(int n) {
		String binary = "";
		while( n >= 1 ) {
			binary = ( n % 2 ) + binary;
			n /= 2;			
		}
		return binary;
	}
	
	/**
	 * Converts a binary to decimal.
	 * @param binary The binary.
	 * @return The decimal.
	 */
	public static int binaryToInteger(String binary) {
		int number = 0;
		int cyphr = 0;
		for( int i=0; i<binary.length(); i++ ) {
			cyphr = Integer.parseInt( "" + binary.charAt( i ) );
			if( cyphr == 1 ) {
				number += Math.pow( 2 , i ); 
			}
		}
		return number;
	}
	
}
