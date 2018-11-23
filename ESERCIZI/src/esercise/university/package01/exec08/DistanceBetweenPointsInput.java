package esercise.university.package01.exec08;

import core.Input;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import model.geometric.Point;

@Data
@EqualsAndHashCode( callSuper = false )
@ToString
public class DistanceBetweenPointsInput extends Input {

	private Point p1;
	private Point p2;
	
	public DistanceBetweenPointsInput(Point p1, Point p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}
	
}
