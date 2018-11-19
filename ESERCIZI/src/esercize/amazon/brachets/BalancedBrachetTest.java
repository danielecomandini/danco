package esercize.amazon.brachets;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import core.TestParameters;

public class BalancedBrachetTest {

	private TestParameters[] testCases;
	
	@Before
	public void setup() {
		testCases = new TestParameters[] {
			new TestParameters( new BalancedBrachetInput( "[(a+b)]" ), new BalancedBrachetOutput( true ) ),
			new TestParameters( new BalancedBrachetInput( "[(a+b)" ), new BalancedBrachetOutput( false ) ),	
			new TestParameters( new BalancedBrachetInput( "(a+b)]" ), new BalancedBrachetOutput( false ) ),	
			new TestParameters( new BalancedBrachetInput( "{[(a+b)]}" ), new BalancedBrachetOutput( true ) ),	
			new TestParameters( new BalancedBrachetInput( "{[(a+b)*(((a+(b*c)/d)*e)/f)]}" ), new BalancedBrachetOutput( true ) ),	
			new TestParameters( new BalancedBrachetInput( "a+b" ), new BalancedBrachetOutput( true ) )	
		};
	}

	@Test
	public void test() {
		BalancedBrachetSimulator simulator = new BalancedBrachetSimulator();
		for( TestParameters test: testCases ) {
			assertEquals( test.getOutput() , simulator.solve( test.getInput() ) );
		}
	}

}
