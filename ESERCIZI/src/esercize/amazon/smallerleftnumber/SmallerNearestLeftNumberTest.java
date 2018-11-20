package esercize.amazon.smallerleftnumber;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import core.TestParameters;

/**
 * Given a positive integer n, count the total number of set bits in binary representation of all numbers from 1 to n.
 */
public class SmallerNearestLeftNumberTest {

	private TestParameters[] testCases;
	
	@Before
	public void setup() {
		testCases = new TestParameters[] {
			new TestParameters( new SmallerNearestLeftNumberInput( new Integer[] { 1, 6, 4, 10, 2, 5 } ), new SmallerNearestLeftNumberOutput( new Integer[] { null , 1, 1, 4, 1, 2 } ) ),
			new TestParameters( new SmallerNearestLeftNumberInput( new Integer[] { 1, 3, 0, 2, 5 } ), new SmallerNearestLeftNumberOutput( new Integer[] { null, 1, null, 0, 2 } ) )
		};
	}

	@Test
	public void test() {
		SmallerNearestLeftNumberSimulator simulator = new SmallerNearestLeftNumberSimulator();
		for( TestParameters test: testCases ) {
			assertArrayEquals( ( Integer[] ) ( ( SmallerNearestLeftNumberOutput ) test.getOutput() ).getResult(), ( Integer[] ) ( ( SmallerNearestLeftNumberOutput ) simulator.solve( test.getInput() ) ).getResult() );
		}
	}

}
