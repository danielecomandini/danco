package esercize.amazon.square;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import core.TestParameters;
import model.geometric.Point;

/**
 * Check is 4 points given as input, represents the vertex of a square.
 */
public class CheckSquareTest {

	private TestParameters[] testCases;
	
	@Before
	public void setup() {
		testCases = new TestParameters[] {
			new TestParameters( new CheckSquareInput( new Point[] {
					new Point( 10, 20 ),
					new Point( 20, 20 ),
					new Point( 20, 10 ),
					new Point( 10, 10 )
			} ) , new CheckSquareOutput( true )  ),
			new TestParameters( new CheckSquareInput( new Point[] {
					new Point( 10, 20 ),
					new Point( 20, 15 ),
					new Point( 20, 10 ),
					new Point( 10, 10 )
			} ) , new CheckSquareOutput( false )  )
		};
	}

	@Test
	public void test() {
		CheckSquareSimulator simulator = new CheckSquareSimulator();
		for( TestParameters test: testCases ) {
			assertEquals( test.getOutput() , simulator.solve( test.getInput() ) );
		}
	}

}
