package esercise.university.package01.exec08;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import core.TestParameters;
import model.geometric.Point;

/*
 * Esercizio no.7
 * Scrivere un programma che inseriti tre numeri interi rappresentanti i lati di un triangolo, stabilisca se il triangolo sia:
 * 	- EQUILATERO - tutti e tre i lati uguali
 * 	- ISOSCELE - due lati uguali
 * 	- SCALENO - tutti i lati diversi tra loro 
 */
public class DistanceBetweenPointsTest {

	private TestParameters[] testCases;
	
	@Before
	public void setup() {
		testCases = new TestParameters[] {
			new TestParameters( new DistanceBetweenPointsInput( new Point( 1 , 1 ) , new Point( 3 , 3 ) ), new DistanceBetweenPointsOutput( Math.sqrt( 8 ) ) )
		};
	}

	@Test
	public void test() {
		DistanceBetweenPointsSimulator simulator = new DistanceBetweenPointsSimulator();
		for( TestParameters test: testCases ) {
			assertEquals( test.getOutput() , simulator.solve( test.getInput() ) );
		}
	}

}
