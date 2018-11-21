package esercize.amazon.rotate2place;

import core.Input;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode( callSuper = false )
@ToString
public class Rotate2PlaceInput extends Input {

	private String stringToCheck;
	private String stringToRotate;
	
	public Rotate2PlaceInput(String stringToCheck, String stringToRotate) {
		super();
		this.stringToCheck = stringToCheck;
		this.stringToRotate = stringToRotate;
	}
	
}
