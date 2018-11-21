package esercize.amazon.smallerleftnumber;

import core.Input;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode( callSuper = false )
@ToString
public class SmallerNearestLeftNumberInput extends Input {

	private Integer[] array;
	
	public SmallerNearestLeftNumberInput(Integer[] number) {
		super();
		this.array = number;
	}
	
}
