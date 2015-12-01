package nopattern;

import java.awt.Graphics2D;
import java.awt.Point;

/**
 * Visitorパターンを利用したスタンプの基底クラス
 * 
 * @author shiva
 *
 */
public abstract class Stamp {

	private Point position;

	public Stamp(Point p) {
		this.position = p;
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public abstract void paint(Graphics2D g);
	
	

}
