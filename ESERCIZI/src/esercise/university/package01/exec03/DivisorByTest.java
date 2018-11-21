package esercise.university.package01.exec03;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import core.TestParameters;

/*
 * Esercizio no.3 
 * Scrivere un programma che richiesto un numero intero visualizzi tutti i suoi divisori, contandoli.   
 */
public class DivisorByTest {

	private TestParameters[] testCases;
	
	@Before
	public void setup() {
		testCases = new TestParameters[] {
			new TestParameters( new DivisorByInput( 8 ), new DivisorByOutput( new Integer[] { 1, 2, 4, 8 } ) ),
			new TestParameters( new DivisorByInput( 56 ), new DivisorByOutput( new Integer[] { 1, 2, 4, 7, 8, 14, 28, 56 } ) ),
			new TestParameters( new DivisorByInput( 20 ), new DivisorByOutput( new Integer[] { 1, 2, 4, 5, 10, 20 } ) )
		};
	}

	@Test
	public void test() {
		DivisorBySimulator simulator = new DivisorBySimulator();
		for( TestParameters test: testCases ) {
			assertArrayEquals( ( Integer[] ) ( test.getOutput().getResult() ) , ( Integer[] ) ( simulator.solve( test.getInput() ).getResult() ) );
		}
	}

}
