package de.dittich.pacman;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JFrame;

public class Var {

	static JFrame jf1;
	static int screenwidth = 1000;
	static int screenheight = 820;
	static String title = "Pacman";
	static String filePacman = "res/pacman_sprites_full_32.png";
	static String fileMaze = "res/mazeTwo.txt";
	static String fileMazeImage = "res/mazeTwo.png";
	
	static BufferedImage mazeImage;

	static int xPac = 0;
	static int yPac = 0;
	static int speedPac = 5;
	static int pacmanAnimationsFrame = 0;
	
	static int []xG = {0,0,0,0};
	static int []yG = {0,0,0,0};
	static int []dG = {0,0,0,0};//Direction Walk 0, 90, 180, 270
	static int speedG = 30;
	static int ghostOneAnimationsFrame = 0;
	
	static int step = 1;
	
	

	static boolean moveup = false;
	static boolean movedown = false;
	static boolean moveleft = false;
	static boolean moveright = false;
	
	static boolean movenextup = false;
	static boolean movenextdown = false;
	static boolean movenextleft = false;
	static boolean movenextright = false;
	
	static int rotation = 0;

	static Label lbl1;

	// static BufferedImage iPacman;
	static BufferedImage spriteSheet;
	static final int TILE_SIZE = 32;
	

	static BufferedImage[] iPacman = { Sprite.getSprite(0, 1),
			Sprite.getSprite(1, 1), Sprite.getSprite(2, 1),
			Sprite.getSprite(3, 1), Sprite.getSprite(2, 1),
			Sprite.getSprite(1, 1) };
	
	static BufferedImage[][] ghost = {
			{Sprite.getSprite(0, 4),Sprite.getSprite(1, 4),Sprite.getSprite(2, 4),Sprite.getSprite(3, 4),Sprite.getSprite(4, 4),Sprite.getSprite(5, 4),Sprite.getSprite(6, 4),Sprite.getSprite(7, 4)},
			{Sprite.getSprite(0, 5),Sprite.getSprite(1, 5),Sprite.getSprite(2, 5),Sprite.getSprite(3, 5),Sprite.getSprite(4, 5),Sprite.getSprite(5, 5),Sprite.getSprite(6, 5),Sprite.getSprite(7, 5)},
			{Sprite.getSprite(0, 6),Sprite.getSprite(1, 6),Sprite.getSprite(2, 6),Sprite.getSprite(3, 6),Sprite.getSprite(4, 6),Sprite.getSprite(5, 6),Sprite.getSprite(6, 6),Sprite.getSprite(7, 6)},
			{Sprite.getSprite(0, 7),Sprite.getSprite(1, 7),Sprite.getSprite(2, 7),Sprite.getSprite(3, 7),Sprite.getSprite(4, 7),Sprite.getSprite(5, 7),Sprite.getSprite(6, 7),Sprite.getSprite(7, 7)}
			};

	static int[][] maze = new int[1000][800];
	
	public static void moveUp(){
		Var.moveDel();
		Var.moveup = true;
	}
	
	public static void moveDown(){
		Var.moveDel();
		Var.movedown = true;
	}
	
	public static void moveLeft(){
		Var.moveDel();
		Var.moveleft = true;
	}
	
	public static void moveRight(){
		Var.moveDel();
		Var.moveright = true;
	}
	
	public static void moveDel(){
		Var.moveup = false;
		Var.movedown = false;
		Var.moveleft = false;
		Var.moveright = false;
	}
	
	public static BufferedImage rotate(BufferedImage img, int rotation)
	{
		int w = img.getWidth();
		int h = img.getHeight();
		BufferedImage newImage = new BufferedImage(w, h, img.getType());
		Graphics2D g2d_imageRot = newImage.createGraphics();
		g2d_imageRot.rotate(Math.toRadians(rotation), w/2, h/2);
		g2d_imageRot.drawImage(img,null,0,0);
		return newImage;
	}
}
