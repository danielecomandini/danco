package esercise.university.package01.exec05;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import core.TestParameters;
import model.algebra.Interval;

/*
 * Esercizio no.5
 * Dire se i due intervalli di numeri double a-b e c-d estremi inclusi, si intersecano, cioè se hanno elementi in comune.
 */
public class OverleapIntervalTest {

	private TestParameters[] testCases;
	
	@Before
	public void setup() {
		testCases = new TestParameters[] {
			new TestParameters( new OverleapIntervalInput( new Interval( 1, 8 ), new Interval( 10 , 20 ) ), new OverleapIntervalOutput( false ) ),
			new TestParameters( new OverleapIntervalInput( new Interval( 1, 100 ), new Interval( 10 , 20 ) ), new OverleapIntervalOutput( true ) ),
			new TestParameters( new OverleapIntervalInput( new Interval( 1, 8 ), new Interval( 4 , 20 ) ), new OverleapIntervalOutput( true ) ),
			new TestParameters( new OverleapIntervalInput( new Interval( 16, 38 ), new Interval( 10 , 20 ) ), new OverleapIntervalOutput( true ) )
		};
	}

	@Test
	public void test() {
		OverleapIntervalSimulator simulator = new OverleapIntervalSimulator();
		for( TestParameters test: testCases ) {
			assertEquals( test.getOutput() , simulator.solve( test.getInput() ) );
		}
	}

}
