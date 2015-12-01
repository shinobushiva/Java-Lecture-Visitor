package patterned;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class StampPatternedPanel extends JPanel {

	private List<StampPatterned> stamps = new ArrayList<StampPatterned>();

	private StampDrawVisitorPatterned drawVisitor;

	 private StampClassNameVisitorPatterned nameVisitor = new
	 StampClassNameVisitorPatterned();

	public StampPatternedPanel(StampDrawVisitorPatterned v) {
		this.drawVisitor = v;
	}

	public void addStamp(StampPatterned s) {
		stamps.add(s);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
		drawVisitor.setGraphics(g2d);

		// 全てのスタンプに対してビジターが訪問
		stamps.stream().forEach((x) -> {
			x.visit(drawVisitor);
			 x.visit(nameVisitor);
			});
	}

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8179592742035930991L;

}
