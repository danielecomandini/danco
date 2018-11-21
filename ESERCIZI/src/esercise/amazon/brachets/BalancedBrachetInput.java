package esercize.amazon.brachets;

import core.Input;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode( callSuper = false )
@ToString
public class BalancedBrachetInput extends Input {

	private String equation;
	
	public BalancedBrachetInput(String equation) {
		super();
		this.equation = equation;
	}
	
}
