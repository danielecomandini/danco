package esercize.amazon.countbits;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import core.TestParameters;

/**
 * Given a positive integer n, count the total number of set bits in binary representation of all numbers from 1 to n.
 */
public class CountBitsTest {

	private TestParameters[] testCases;
	
	@Before
	public void setup() {
		testCases = new TestParameters[] {
			new TestParameters( new CountBitsInput( 3 ), new CountBitsOutput( 4 ) ),
			new TestParameters( new CountBitsInput( 6 ), new CountBitsOutput( 9 ) ),
			new TestParameters( new CountBitsInput( 7 ), new CountBitsOutput( 12 ) ),
			new TestParameters( new CountBitsInput( 8 ), new CountBitsOutput( 13 ) )
		};
	}

	@Test
	public void test() {
		CountBitsSimulator simulator = new CountBitsSimulator();
		for( TestParameters test: testCases ) {
			assertEquals( test.getOutput() , simulator.solve( test.getInput() ) );
		}
	}

}
