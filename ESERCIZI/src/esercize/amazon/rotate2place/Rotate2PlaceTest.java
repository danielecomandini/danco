package esercize.amazon.rotate2place;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import core.TestParameters;

public class Rotate2PlaceTest {

	private TestParameters[] testCases;
	
	@Before
	public void setup() {
		testCases = new TestParameters[] {
			new TestParameters( new Rotate2PlaceInput( "amazon" , "azonam" ), new Rotate2PlaceOutput( true ) ),
			new TestParameters( new Rotate2PlaceInput( "amazon" , "onamaz" ), new Rotate2PlaceOutput( true ) ),
			new TestParameters( new Rotate2PlaceInput( "amazon" , "amazon" ), new Rotate2PlaceOutput( false ) )	
		};
	}

	@Test
	public void test() {
		Rotate2PlaceSimulator simulator = new Rotate2PlaceSimulator();
		for( TestParameters test: testCases ) {
			assertEquals( test.getOutput() , simulator.solve( test.getInput() ) );
		}
	}

}
