import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

public class Panel extends JPanel{
	
	Pacman p;
	
	public Panel(){
		super();
		p = new Pacman(50, 50);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		super.paintComponent(g2);
		p.draw(g2);
	}
	
	public void update(){
		p.update();
	}
	
}
