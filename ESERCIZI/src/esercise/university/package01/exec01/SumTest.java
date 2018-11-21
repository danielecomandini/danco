package esercise.university.package01.exec01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import core.TestParameters;

/**
 * Check if the brachet into an equation are balanced.
 * [(a+b)*(5/(a+c))] ==> BALANCED
 * [a+b)] ==> UNBALANCED
 */
public class SumTest {

	private TestParameters[] testCases;
	
	@Before
	public void setup() {
		testCases = new TestParameters[] {
			new TestParameters( new SumInput( 2, 6 ), new SumOutput( 20 ) ),
			new TestParameters( new SumInput( 89, 104 ), new SumOutput( 1544 ) ),
			new TestParameters( new SumInput( 1, 5 ), new SumOutput( 15 ) )
		};
	}

	@Test
	public void test() {
		SumSimulator simulator = new SumSimulator();
		for( TestParameters test: testCases ) {
			assertEquals( test.getOutput() , simulator.solve( test.getInput() ) );
		}
	}

}
