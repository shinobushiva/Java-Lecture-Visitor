package nopattern;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class StampPanel extends JPanel {

	private List<Stamp> stamps = new ArrayList<Stamp>();

	public void addStamp(Stamp s) {
		stamps.add(s);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		// 全てのスタンプのpaintメソッドを呼び出し
		stamps.stream().forEach((x) -> {
			x.paint(g2d);
		});
	}

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8179592742035930991L;

}
