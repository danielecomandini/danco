package esercise.university.package01.exec06;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import core.TestParameters;
import model.algebra.Interval;

/*
 * Esercizio no.6
 * Data una serie di numeri interi positivi, individuare il massimo e il minimo.
 */
public class MinMaxTest {

	private TestParameters[] testCases;
	
	@Before
	public void setup() {
		testCases = new TestParameters[] {
			new TestParameters( new MinMaxInput( new Integer[] { 2, 5, 11, 25, 3, 8, 16 } ), new MinMaxOutput( new MinMaxModel( 2 , 25 ) ) ),
			new TestParameters( new MinMaxInput( new Integer[] { 27, 9, 13, 25, 33, 28, 106 } ), new MinMaxOutput( new MinMaxModel( 9 , 106 ) ) ),
			new TestParameters( new MinMaxInput( new Integer[] { 12, 15, 111, 125, 23, 83, 116 } ), new MinMaxOutput( new MinMaxModel( 12 , 125 ) ) ),
		};
	}

	@Test
	public void test() {
		MinMaxSimulator simulator = new MinMaxSimulator();
		for( TestParameters test: testCases ) {
			assertEquals( test.getOutput() , simulator.solve( test.getInput() ) );
		}
	}

}
