package esercise.university.package01.exec05;

import core.Input;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import model.algebra.Interval;

@Data
@EqualsAndHashCode( callSuper = false )
@ToString
public class OverleapIntervalInput extends Input {

	private Interval interval1;
	private Interval interval2;
	
	public OverleapIntervalInput(Interval interval1, Interval interval2) {
		super();
		this.interval1 = interval1;
		this.interval2 = interval2;
	}
	
}
