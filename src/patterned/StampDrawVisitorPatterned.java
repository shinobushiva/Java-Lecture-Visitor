package patterned;

import java.awt.Graphics2D;
import java.awt.Point;

import common.Visitor;

/**
 * スタンプの描画を担当するVisitor
 * 
 * @author shiva
 *
 */
public class StampDrawVisitorPatterned extends Visitor {

	private Graphics2D g;

	public Graphics2D getGraphics() {
		return g;
	}

	public void setGraphics(Graphics2D g) {
		this.g = g;
	}

	/**
	 * PatternedCircleStampに対する処理
	 * 
	 * @param s
	 */
	public void visited(CircleStampPatterned s) {
		Point p = s.getPosition();
		g.fillOval(p.x, p.y, s.getRadius() * 2, s.getRadius() * 2);
	}

	/**
	 * PatternedStringStampに対する処理
	 * 
	 * @param s
	 */
	public void visited(StringStampPatterned s) {
		Point p = s.getPosition();
		g.drawString(s.getString(), p.x, p.y);
	}

}
