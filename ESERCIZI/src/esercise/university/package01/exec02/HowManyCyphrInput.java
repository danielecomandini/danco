package esercise.university.package01.exec02;

import core.Input;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode( callSuper = false )
@ToString
public class HowManyCyphrInput extends Input {

	private int number;
	
	public HowManyCyphrInput(int number) {
		super();
		this.number = number;
	}
	
}
