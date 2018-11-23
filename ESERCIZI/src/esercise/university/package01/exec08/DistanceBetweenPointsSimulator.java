package esercise.university.package01.exec08;

import core.Input;
import core.Output;
import core.TestSimulator;
import model.geometric.Point;
import utils.PitagoraTheorema;

public class DistanceBetweenPointsSimulator extends TestSimulator {

	@Override
	public Output solve(Input input) {
		Point p1 = ( ( DistanceBetweenPointsInput ) input ).getP1();
		Point p2 = ( ( DistanceBetweenPointsInput ) input ).getP2();

		int cat1 = Math.abs( p1.getX() - p2.getX() );
		int cat2 = Math.abs( p1.getY() - p2.getY() );
		
		double ipotenusa = PitagoraTheorema.calculateIpotenusa( cat1 , cat2 );
		
		return new DistanceBetweenPointsOutput( ipotenusa );
	}

}
