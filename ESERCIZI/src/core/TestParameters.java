package core;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode( callSuper = false )
@ToString
public class TestParameters {

	private Input input;
	private Output output;
	
	public TestParameters(Input balancedBrachetTest, Output output) {
		this.input = balancedBrachetTest;
		this.output = output;
	}
	
}
