package esercize.amazon.rotate2place;

import core.Input;
import core.Output;
import core.TestSimulator;

public class Rotate2PlaceSimulator extends TestSimulator {

	@Override
	public Output solve(Input input) {
		String check = ( ( Rotate2PlaceInput ) input ).getStringToCheck();
		String rotate = ( ( Rotate2PlaceInput ) input ).getStringToRotate();
		
		return new Rotate2PlaceOutput( check.equals( rotateClockwise( rotate ) ) || check.equals( rotateAntiClockwise( rotate ) ) );
	}

	private String rotateClockwise(String rotate) {
		String newString = rotate.substring( 0 , 2 );
		return rotate.substring( 2 ).concat( newString );
	}
	
	private String rotateAntiClockwise(String rotate) {
		int length = rotate.length();
		String newString = rotate.substring( length - 2, length );
		return newString.concat( rotate.substring( 0 , length - 2 ) );
	}

}
