package common;

import lesson.RectangleStampPatterned;
import patterned.CircleStampPatterned;
import patterned.StringStampPatterned;

public abstract class Visitor {
	/**
	 * CircleStampPatternedに対する処理
	 * 
	 * @param s
	 */
	public void visited(CircleStampPatterned s) {
	}

	/**
	 * StringStampPatternedに対する処理
	 * 
	 * @param s
	 */
	public void visited(StringStampPatterned s) {
	}

	/**
	 * RectangleStampPatternedに対する処理（課題で実装）
	 * 
	 * @param s
	 */
	public void visited(RectangleStampPatterned s) {
	}

}
