package esercize.amazon.countbits;

import core.Input;
import core.Output;
import core.TestSimulator;
import utils.BinaryUtils;

public class CountBitsSimulator extends TestSimulator {

	@Override
	public Output solve(Input input) {
		Integer result = 0;
		Integer n = ( ( CountBitsInput ) input ).getNumber();
		
		for( int i=1; i<=n; i++ ) {
			String binary = BinaryUtils.integerToBinary( i );
			result += binary.replace( "0" , "" ).length();
		}
		
		return new CountBitsOutput( result );
	}

}
