package esercise.university.package01.exec06;

import core.Input;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import model.algebra.Interval;

@Data
@EqualsAndHashCode( callSuper = false )
@ToString
public class MinMaxInput extends Input {

	private Integer[] array;
	
	public MinMaxInput(Integer[] array) {
		super();
		this.array = array;
	}
	
}
