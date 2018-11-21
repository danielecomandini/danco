package esercise.university.package01.exec01;

import core.Input;
import core.Output;
import core.TestSimulator;

public class SumSimulator extends TestSimulator {

	@Override
	public Output solve(Input input) {
		int result = 0;
		int a = ( ( SumInput ) input ).getA();
		int b = ( ( SumInput ) input ).getB();
		
		result = b;
		for( int i=a; i<b; i++ ) {
			result += i;
		}
		
		return new SumOutput( result );
	}

}
