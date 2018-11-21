package esercize.amazon.countbits;

import core.Input;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode( callSuper = false )
@ToString
public class CountBitsInput extends Input {

	private Integer number;
	
	public CountBitsInput(Integer number) {
		super();
		this.number = number;
	}
	
}
