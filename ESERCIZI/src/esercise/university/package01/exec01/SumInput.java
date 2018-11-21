package esercise.university.package01.exec01;

import core.Input;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode( callSuper = false )
@ToString
public class SumInput extends Input {

	private int a;
	private int b;
	
	public SumInput(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
}
