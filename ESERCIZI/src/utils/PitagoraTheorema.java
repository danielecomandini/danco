package utils;

public class PitagoraTheorema {

	public static double calculateIpotenusa(Integer cat1, Integer cat2) {
		return Math.sqrt( Math.pow( cat1 , 2 ) + Math.pow( cat2 , 2 ) );
	}
	
	public static double calculateCateto(Integer ipotenusa, Integer cateto) {
		return Math.sqrt( Math.pow( ipotenusa , 2 ) - Math.pow( cateto , 2 ) );
	}
	
	public static void main(String[] argv) {
		System.out.println( "IPOTENUSA: " + calculateIpotenusa( 4 , 4 ) );
	}
}
