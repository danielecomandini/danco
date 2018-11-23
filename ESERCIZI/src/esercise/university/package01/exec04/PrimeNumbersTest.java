package esercise.university.package01.exec04;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import core.TestParameters;

/*
 * Esercizio no.4 
 * Calcola i numeri primi compresi tra due numeri interi inseriti dall'utente.
 */
public class PrimeNumbersTest {

	private TestParameters[] testCases;
	
	@Before
	public void setup() {
		testCases = new TestParameters[] {
			new TestParameters( new PrimeNumbersInput( 2, 10 ), new PrimeNumbersOutput( new Integer[] { 2, 3, 5, 7 } ) ),
			new TestParameters( new PrimeNumbersInput( 5, 20 ), new PrimeNumbersOutput( new Integer[] { 5, 7, 11, 13, 17, 19 } ) ),
			new TestParameters( new PrimeNumbersInput( 1, 30 ), new PrimeNumbersOutput( new Integer[] { 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 } ) )
		};
	}

	@Test
	public void test() {
		PrimeNumbersSimulator simulator = new PrimeNumbersSimulator();
		for( TestParameters test: testCases ) {
			assertArrayEquals( ( Integer[] ) ( test.getOutput().getResult() ) , ( Integer[] ) ( simulator.solve( test.getInput() ).getResult() ) );
		}
	}

}
