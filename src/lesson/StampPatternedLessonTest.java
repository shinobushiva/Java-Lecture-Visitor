package lesson;

import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import patterned.CircleStampPatterned;
import patterned.StampPatternedPanel;
import patterned.StringStampPatterned;

/**
 * RectangleStampPatternedを含めたテスト
 * 
 * @author shiva
 *
 */
public class StampPatternedLessonTest {

	public static void main(String[] args) {
		StampPatternedPanel comp = new StampPatternedPanel(
				new StampDrawerPatternedEx());

		comp.addStamp(new CircleStampPatterned(new Point(30, 30), 10));
		comp.addStamp(new CircleStampPatterned(new Point(100, 80), 30));
		comp.addStamp(new StringStampPatterned(new Point(200, 50),
				"Hello World!"));
		// RectangleStampPatternedもスタンプとして追加
		comp.addStamp(new RectangleStampPatterned(new Point(300, 100), 30, 60));

		JFrame f = new JFrame();
		f.add(comp);

		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 640, 480);
		f.setVisible(true);
	}
}
