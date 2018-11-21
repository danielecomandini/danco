package esercize.amazon.square;

import core.Input;
import core.Output;
import core.TestSimulator;
import model.geometric.Point;

public class CheckSquareSimulator extends TestSimulator {

	@Override
	public Output solve(Input input) {
		Boolean result = true;
		Point[] points = ( ( CheckSquareInput ) input ).getPoints();
		
		int lato = 0;
		int diff = 0;
		
		for( int i=0; i<points.length-1 && result; i++ ) {
			for( int j=i+1; j<points.length && result; j++ ) {
				if( haveInCommon( points[i] , points[j] ) ) {
					int x1 = points[i].getX();
					int y1 = points[i].getY();
					int x2 = points[j].getX();
					int y2 = points[j].getY();
					if( x1 - x2 == 0 ) {
						diff = Math.abs( y1 - y2 );
					} else {
						diff = Math.abs( x1 - x2 );
					}
					
					if( lato == 0 || lato == diff ) {
						lato = diff;
					} else {
						result = false; 
					}
				}
			}
		}
		
		return new CheckSquareOutput( result );
	}

	private boolean haveInCommon(Point point1, Point point2) {
		return point1.getX() == point2.getX() || point1.getY() == point2.getY();
	}

}
