package de.dittich.pacman;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Label extends JLabel {
	private static final long serialVersionUID = 1L;

	public Label() {

	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.rotate(Math.toRadians(Var.rotation), Var.x+(Var.TILE_SIZE/2), Var.y+(Var.TILE_SIZE/2));//Drehpunkt verschieben ins Zentrum von Pacman
		g2d.drawImage(Var.iPacman[Var.pacmanAnimationsFrame], Var.x, Var.y, Var.TILE_SIZE,
				Var.TILE_SIZE, null);
		repaint();
	}
}
