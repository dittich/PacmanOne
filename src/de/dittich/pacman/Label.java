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
		g2d.drawImage(Var.mazeImage, 0, 0, null);
		g2d.drawImage(Var.rotate(Var.iPacman[Var.pacmanAnimationsFrame], Var.rotation), Var.xPac-Var.TILE_SIZE/2, Var.yPac-Var.TILE_SIZE/2, Var.TILE_SIZE,
				Var.TILE_SIZE, null);
		g2d.rotate(Math.toRadians(0), Var.xPac, Var.yPac);
		g2d.drawImage(Var.ghost[0][Var.ghostOneAnimationsFrame], Var.xG[0]-Var.TILE_SIZE/2, Var.yG[0]-Var.TILE_SIZE/2, Var.TILE_SIZE,
				Var.TILE_SIZE, null);
		g2d.drawImage(Var.ghost[1][Var.ghostOneAnimationsFrame], Var.xG[1]-Var.TILE_SIZE/2, Var.yG[1]-Var.TILE_SIZE/2, Var.TILE_SIZE,
				Var.TILE_SIZE, null);
		g2d.drawImage(Var.ghost[2][Var.ghostOneAnimationsFrame], Var.xG[2]-Var.TILE_SIZE/2, Var.yG[2]-Var.TILE_SIZE/2, Var.TILE_SIZE,
				Var.TILE_SIZE, null);
		g2d.drawImage(Var.ghost[3][Var.ghostOneAnimationsFrame], Var.xG[3]-Var.TILE_SIZE/2, Var.yG[3]-Var.TILE_SIZE/2, Var.TILE_SIZE,
				Var.TILE_SIZE, null);
	}
}
