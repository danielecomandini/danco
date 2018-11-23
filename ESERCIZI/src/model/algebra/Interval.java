package model.algebra;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode( callSuper = false )
@ToString
public class Interval {

	private Integer inf;
	private Integer sup;
	
	public Interval(Integer inf, Integer sup) {
		this.inf = inf;
		this.sup = sup;
	}
}
