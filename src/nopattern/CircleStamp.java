package nopattern;

import java.awt.Graphics2D;
import java.awt.Point;

/**
 * Visitorパターンを利用しない円のスタンプ
 * 
 * @author shiva
 *
 */
public class CircleStamp extends Stamp {

	private int radius;

	public CircleStamp(Point p, int r) {
		super(p);
		this.radius = r;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void paint(Graphics2D g) {
		Point p = getPosition();
		g.fillOval(p.x, p.y, getRadius() * 2, getRadius() * 2);
	}

}
