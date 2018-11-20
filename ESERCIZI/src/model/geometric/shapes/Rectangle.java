package model.geometric.shapes;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import model.geometric.Point;

@Data
@EqualsAndHashCode( callSuper = false )
@ToString
public class Rectangle {

	private Point vertexTopSx;
	private Point vertexTopDx;
	private Point vertexBottomDx;
	private Point vertexBottomSx;
	
	public Rectangle(Point vertexTopSx, Point vertexBottomDx) {
		this.vertexTopSx = vertexTopSx;
		this.vertexBottomDx = vertexBottomDx;
		getOtherVertex();
	}

	private void getOtherVertex() {
		this.vertexTopDx = new Point( vertexBottomDx.getX() , vertexTopSx.getY() );
		this.vertexBottomSx = new Point( vertexTopSx.getX() , vertexBottomDx.getY() );
	}
}
