package patterned;

import java.awt.Point;

import common.Visitor;

/**
 * Visitorパターンを利用したスタンプの基底クラス
 * 
 * @author shiva
 *
 */
public abstract class StampPatterned {

	private Point position;

	public StampPatterned(Point p) {
		this.position = p;
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public abstract void visit(Visitor visitor);

}
