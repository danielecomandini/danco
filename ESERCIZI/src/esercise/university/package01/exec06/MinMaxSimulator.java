package esercise.university.package01.exec06;

import core.Input;
import core.Output;
import core.TestSimulator;
import model.algebra.Interval;

public class MinMaxSimulator extends TestSimulator {

	@Override
	public Output solve(Input input) {
		boolean result = false;
		Integer[] array = ( ( MinMaxInput ) input ).getArray();

		int min = array[0];
		int max = array[0];
		for( int i=1; i<array.length; i++ ) {
			if( array[i] < min ) { min = array[i]; }
			else if( array[i] > max ) { max = array[i]; }
		}
		
		return new MinMaxOutput( new MinMaxModel( min , max ) );
	}

}
