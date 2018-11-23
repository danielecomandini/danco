package esercise.university.package01.exec07;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import core.TestParameters;

/*
 * Esercizio no.7
 * Scrivere un programma che inseriti tre numeri interi rappresentanti i lati di un triangolo, stabilisca se il triangolo sia:
 * 	- EQUILATERO - tutti e tre i lati uguali
 * 	- ISOSCELE - due lati uguali
 * 	- SCALENO - tutti i lati diversi tra loro 
 */
public class WhichTriangleTest {

	private TestParameters[] testCases;
	
	@Before
	public void setup() {
		testCases = new TestParameters[] {
			new TestParameters( new WhichTriangleInput( 5, 5, 5 ), new WhichTriangleOutput( TriangleType.EQUILATERO ) ),
			new TestParameters( new WhichTriangleInput( 5, 9, 5 ), new WhichTriangleOutput( TriangleType.ISOSCELE ) ),
			new TestParameters( new WhichTriangleInput( 5, 9, 7 ), new WhichTriangleOutput( TriangleType.SCALENO ) )
		};
	}

	@Test
	public void test() {
		WhichTriangleSimulator simulator = new WhichTriangleSimulator();
		for( TestParameters test: testCases ) {
			assertEquals( test.getOutput() , simulator.solve( test.getInput() ) );
		}
	}

}
