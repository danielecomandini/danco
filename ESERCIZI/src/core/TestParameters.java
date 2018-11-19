package core;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode( callSuper = false )
@ToString
public class TestParameters {

	private Input input;
	private Output output;
	
	public TestParameters(Input input, Output output) {
		this.input = input;
		this.output = output;
	}
	
}
