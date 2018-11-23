package esercise.university.package01.exec05;

import core.Input;
import core.Output;
import core.TestSimulator;
import model.algebra.Interval;

public class OverleapIntervalSimulator extends TestSimulator {

	@Override
	public Output solve(Input input) {
		boolean result = false;
		Interval interval1 = ( ( OverleapIntervalInput ) input ).getInterval1();
		Interval interval2 = ( ( OverleapIntervalInput ) input ).getInterval2();
		
		if( ( interval1.getInf() >= interval2.getInf() && interval1.getInf() <= interval2.getSup() )
		 || ( interval1.getSup() >= interval2.getInf() && interval1.getInf() <= interval2.getSup() ) 
		 || ( interval2.getInf() >= interval1.getInf() && interval2.getInf() <= interval1.getSup() )
		 || ( interval2.getSup() >= interval1.getInf() && interval2.getInf() <= interval1.getSup() ) ) {
			result = true;
		}
		
		return new OverleapIntervalOutput( result );
	}

}
