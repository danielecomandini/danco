package esercise.university.package01.exec06;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode( callSuper = false )
@ToString
public class MinMaxModel {

	private int min;
	private int max;
	
	public MinMaxModel(int min, int max) {
		this.min = min;
		this.max = max;
	}
	
}
