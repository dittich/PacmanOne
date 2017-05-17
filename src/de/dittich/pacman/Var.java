package de.dittich.pacman;

import java.awt.image.BufferedImage;
import javax.swing.JFrame;

public class Var {

	static JFrame jf1;
	static int screenwidth = 1000;
	static int screenheight = 800;
	static String title = "Pacman";
	static String filePacman = "res/pacman_sprites_full_32.png";

	static int x = 500;
	static int y = 400;

	static int speed = 2;

	static boolean moveup = false;
	static boolean movedown = false;
	static boolean moveleft = false;
	static boolean moveright = false;
	
	static int rotation = 0;

	static Label lbl1;

	// static BufferedImage iPacman;
	static BufferedImage spriteSheet;
	static final int TILE_SIZE = 32;
	static int pacmanAnimationsFrame = 0;

	static BufferedImage[] iPacman = { Sprite.getSprite(0, 1),
			Sprite.getSprite(1, 1), Sprite.getSprite(2, 1),
			Sprite.getSprite(3, 1), Sprite.getSprite(2, 1),
			Sprite.getSprite(1, 1) };

	public Var() {

	}
}
