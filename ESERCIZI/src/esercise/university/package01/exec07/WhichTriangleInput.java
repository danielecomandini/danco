package esercise.university.package01.exec07;

import core.Input;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode( callSuper = false )
@ToString
public class WhichTriangleInput extends Input {

	private int lato1;
	private int lato2;
	private int lato3;
	
	public WhichTriangleInput(int lato1, int lato2, int lato3) {
		super();
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.lato3 = lato3;
	}
	
}
