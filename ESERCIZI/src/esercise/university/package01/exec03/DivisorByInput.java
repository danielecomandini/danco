package esercise.university.package01.exec03;

import core.Input;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode( callSuper = false )
@ToString
public class DivisorByInput extends Input {

	private int number;
	
	public DivisorByInput(int number) {
		super();
		this.number = number;
	}
	
}
