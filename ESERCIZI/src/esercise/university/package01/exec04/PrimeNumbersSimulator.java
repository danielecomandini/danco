package esercise.university.package01.exec04;

import java.util.ArrayList;
import java.util.List;

import core.Input;
import core.Output;
import core.TestSimulator;
import utils.PrimaryNumber;

public class PrimeNumbersSimulator extends TestSimulator {

	@Override
	public Output solve(Input input) {
		int from = ( ( PrimeNumbersInput ) input ).getFrom();
		int to = ( ( PrimeNumbersInput ) input ).getTo();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for( int i=from; i<=to; i++ ) {
			if( PrimaryNumber.isPrimaryNumber( i ) ) {
				list.add( i );
			}
		}
		
		Integer[] result = new Integer[ list.size() ];
		list.toArray( result );
		
		return new PrimeNumbersOutput( result );
	}

}
