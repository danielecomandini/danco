package esercise.university.package01.exec02;

import core.Input;
import core.Output;
import core.TestSimulator;

public class HowManyCyphrSimulator extends TestSimulator {

	@Override
	public Output solve(Input input) {
		int result = 0;
		int number = ( ( HowManyCyphrInput ) input ).getNumber();
		
		while( number > 0 ) {
			number /= 10;
			result ++;
		}
		
		return new HowManyCyphrOutput( result );
	}

}
