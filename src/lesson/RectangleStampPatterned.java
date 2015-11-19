package lesson;

import java.awt.Point;

import patterned.StampPatterned;

import common.Visitor;

/**
 * [課題]Visitorパターンを利用した長方形のスタンプを実装せよ
 * 
 * @author shiva
 *
 */
public class RectangleStampPatterned extends StampPatterned {

	/**
	 * 位置と、幅と高さを受け取るように実装
	 * 
	 * @param p
	 * @param w
	 * @param h
	 */
	public RectangleStampPatterned(Point p, int w, int h) {
		super(p);
	}

	@Override
	public void visit(Visitor visitor) {
		visitor.visited(this);
	}

}
