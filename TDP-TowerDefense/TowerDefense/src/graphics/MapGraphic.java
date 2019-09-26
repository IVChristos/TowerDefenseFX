package graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MapGraphic {
	protected JLabel grafico;
	protected final int width = 1280;
	protected final int height = 720;
	
	public MapGraphic() {
		grafico = new JLabel(new ImageIcon(this.getClass().getResource("/img/white_bkg.png")));
		grafico.setVisible(true);
		grafico.setBounds(0, 0, width, height);
	}
	
	public JLabel getGrafico() {
		return grafico;
	}
}
