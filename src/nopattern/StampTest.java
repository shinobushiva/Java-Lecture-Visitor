package nopattern;

import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class StampTest {

	public static void main(String[] args) {
		StampPanel comp = new StampPanel();
		comp.addStamp(new CircleStamp(new Point(30, 30), 10));
		comp.addStamp(new CircleStamp(new Point(100, 80), 30));
		comp.addStamp(new StringStamp(new Point(200, 50), "Hello World!"));

		JFrame f = new JFrame();
		f.add(comp);

		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 640, 480);
		f.setVisible(true);
	}
}
