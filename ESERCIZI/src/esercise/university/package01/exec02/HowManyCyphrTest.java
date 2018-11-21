package esercise.university.package01.exec02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import core.TestParameters;

/*
 * Esercizio no.2
 * Scrivi un programma che inserito un numero intero dica in uscita da quante cifre è formato .
 */
public class HowManyCyphrTest {

	private TestParameters[] testCases;
	
	@Before
	public void setup() {
		testCases = new TestParameters[] {
			new TestParameters( new HowManyCyphrInput( 3457256 ), new HowManyCyphrOutput( 7 ) ),
			new TestParameters( new HowManyCyphrInput( 3472 ), new HowManyCyphrOutput( 4 ) ),
			new TestParameters( new HowManyCyphrInput( 38452942 ), new HowManyCyphrOutput( 8 ) )
		};
	}

	@Test
	public void test() {
		HowManyCyphrSimulator simulator = new HowManyCyphrSimulator();
		for( TestParameters test: testCases ) {
			assertEquals( test.getOutput() , simulator.solve( test.getInput() ) );
		}
	}

}
