package de.infogk1.pacman;

import java.awt.Graphics;
import java.awt.Graphics2D;

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
		update();
	}
	
	long lastFrame = System.currentTimeMillis();
	public void update(){
		long thisFrame = System.currentTimeMillis();
		float tslf = (thisFrame-lastFrame)/1000f;
		lastFrame = thisFrame;
		p.update(tslf);
	}
	
}
