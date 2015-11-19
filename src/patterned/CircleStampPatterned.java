package patterned;

import java.awt.Point;

import common.Visitor;

/**
 * Visitorパターンを利用した円のスタンプ
 * 
 * @author shiva
 *
 */
public class CircleStampPatterned extends StampPatterned {

	private int radius;

	public CircleStampPatterned(Point p, int r) {
		super(p);
		this.radius = r;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void visit(Visitor visitor) {
		visitor.visited(this);
	}

}
