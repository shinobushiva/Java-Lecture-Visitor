package patterned;

import java.awt.Point;

import common.Visitor;

/**
 * Visitorパターンを利用した文字列のスタンプ
 * 
 * @author shiva
 *
 */
public class StringStampPatterned extends StampPatterned {
	private String string;

	public StringStampPatterned(Point p, String str) {
		super(p);
		this.setString(str);
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public void visit(Visitor visitor) {
		visitor.visited(this);
	}

}
