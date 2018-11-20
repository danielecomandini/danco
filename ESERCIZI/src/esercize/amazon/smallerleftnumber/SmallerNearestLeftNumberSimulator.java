package esercize.amazon.smallerleftnumber;

import core.Input;
import core.Output;
import core.TestSimulator;
import utils.BinaryUtils;

public class SmallerNearestLeftNumberSimulator extends TestSimulator {

	@Override
	public Output solve(Input input) {
		Integer[] n = ( ( SmallerNearestLeftNumberInput ) input ).getArray();
		Integer[] result = new Integer[ n.length ];
		
		result[0] = null;
		
		for( int i=1; i<n.length; i++ ) {
			for( int j=i-1; j>=0; j-- ) {
				int check = n[i];
				int with = n[j];
				if( n[i] > n[j] ) {
					result[i] = n[j];
					break;
				}
			}
		}
		
		return new SmallerNearestLeftNumberOutput( result );
	}

}
