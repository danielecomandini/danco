package esercise.university.package01.exec03;

import java.util.Set;
import java.util.TreeSet;

import core.Input;
import core.Output;
import core.TestSimulator;

public class DivisorBySimulator extends TestSimulator {

	@Override
	public Output solve(Input input) {
		int number = ( ( DivisorByInput ) input ).getNumber();
		
		Set<Integer> divisorSet = new TreeSet<Integer>();
		
		for( int i=1; i<number/2; i++ ) {
			if( ( number % i ) == 0 ) {
				if( divisorSet.contains( i ) ) {
					// Ho gia salvato il divisore corrente come divisore di un altro numero, per cui trovero' tutti i divisori che ho gia' trovato.
					break;
				}
				int other = number / i;
				divisorSet.add( i );
				divisorSet.add( other );
			}
		}
		
		Integer[] result = new Integer[ divisorSet.size() ];
		int i=0;
		for( Integer key: divisorSet ) {
			result[i] = key;
			i++;
		}
		
		return new DivisorByOutput( result );
	}

}
