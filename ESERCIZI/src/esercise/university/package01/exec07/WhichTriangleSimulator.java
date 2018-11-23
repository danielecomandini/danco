package esercise.university.package01.exec07;

import core.Input;
import core.Output;
import core.TestSimulator;

public class WhichTriangleSimulator extends TestSimulator {

	@Override
	public Output solve(Input input) {
		TriangleType result = null;
		int lato1 = ( ( WhichTriangleInput ) input ).getLato1();
		int lato2 = ( ( WhichTriangleInput ) input ).getLato2();
		int lato3 = ( ( WhichTriangleInput ) input ).getLato3();

		if( lato1 == lato2 && lato1 == lato3 ) { result = TriangleType.EQUILATERO; }
		else if( lato1 == lato2 || lato1 == lato3 || lato2 == lato3 ) { result = TriangleType.ISOSCELE; }
		else { result = TriangleType.SCALENO; }
		
		return new WhichTriangleOutput( result );
	}

}
