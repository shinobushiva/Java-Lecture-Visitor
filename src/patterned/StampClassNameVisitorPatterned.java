package patterned;

import java.awt.Graphics2D;

import common.Visitor;

/**
 * スタンプの描画を担当するVisitor
 * 
 * @author shiva
 *
 */
public class StampClassNameVisitorPatterned extends Visitor {

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
		System.out.println(s.getClass());
	}

	/**
	 * PatternedStringStampに対する処理
	 * 
	 * @param s
	 */
	public void visited(StringStampPatterned s) {
		System.out.println(s.getClass());
	}

}
