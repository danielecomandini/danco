package esercise.university.package01.exec04;

import core.Input;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode( callSuper = false )
@ToString
public class PrimeNumbersInput extends Input {

	private int from;
	private int to;
	
	public PrimeNumbersInput(int from, int to) {
		super();
		this.from = from;
		this.to = to;
	}
	
}
