package esercize.amazon.square;

import core.Input;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode( callSuper = false )
@ToString
public class CheckSquareInput extends Input {

	private Point[] points;
	
	public CheckSquareInput(Point[] points) {
		super();
		this.points = points;
	}
	
}
