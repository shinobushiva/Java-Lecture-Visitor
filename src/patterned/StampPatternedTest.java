package patterned;

import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class StampPatternedTest {

	public static void main(String[] args) {
		StampPatternedPanel comp = new StampPatternedPanel(
				new StampDrawVisitorPatterned());
		comp.addStamp(new CircleStampPatterned(new Point(30, 30), 10));
		comp.addStamp(new CircleStampPatterned(new Point(100, 80), 30));
		comp.addStamp(new StringStampPatterned(new Point(200, 50),
				"Hello World!"));

		JFrame f = new JFrame();
		f.add(comp);

		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 640, 480);
		f.setVisible(true);
	}
}
