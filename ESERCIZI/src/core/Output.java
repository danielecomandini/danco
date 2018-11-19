package core;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode( callSuper = false )
@ToString
public abstract class Output {

	protected Object result;
	
	protected Output(Object result) {
		this.result = result;
	}
	
}
