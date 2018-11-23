package esercise.university.package01.exec07;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import core.TestParameters;

/*
 * Esercizio no.6
 * Data una serie di numeri interi positivi, individuare il massimo e il minimo.
 */
public class WhichTriangleTest {

	private TestParameters[] testCases;
	
	@Before
	public void setup() {
		testCases = new TestParameters[] {
			new TestParameters( new WhichTriangleInput( 5, 5, 5 ), new WhichTriangleOutput( TriangleType.EQUILATERO ) ),
			new TestParameters( new WhichTriangleInput( 5, 9, 5 ), new WhichTriangleOutput( TriangleType.ISOSCELE ) ),
			new TestParameters( new WhichTriangleInput( 5, 9, 7 ), new WhichTriangleOutput( TriangleType.SCALENO ) )
		};
	}

	@Test
	public void test() {
		WhichTriangleSimulator simulator = new WhichTriangleSimulator();
		for( TestParameters test: testCases ) {
			assertEquals( test.getOutput() , simulator.solve( test.getInput() ) );
		}
	}

}
