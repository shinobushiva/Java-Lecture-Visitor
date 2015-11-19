package nopattern;

import java.awt.Graphics2D;
import java.awt.Point;

/**
 * Visitorパターンを利用した文字列のスタンプ
 * 
 * @author shiva
 *
 */
public class StringStamp extends Stamp {
	private String string;

	public StringStamp(Point p, String str) {
		super(p);
		this.setString(str);
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public void paint(Graphics2D g) {
		Point p = getPosition();
		g.drawString(getString(), p.x, p.y);
	}

}
