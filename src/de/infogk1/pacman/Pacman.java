package de.infogk1.pacman;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Pacman extends JPanel{

	float x;
	float y;
	int speed = 500;
	long lastFrame = System.currentTimeMillis();
	BufferedImage texture;
	
	public Pacman(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void draw(Graphics2D g){
		g.drawString("Das ist Pacman", 40, 40);
		g.setColor(Color.YELLOW);
		
		texture = Spriteloader.getSprites(32, 32, 6, 1, 0, 0)[1];

		g.drawImage(texture, null, (int)x, (int)y);
	}
	
	public void update(float tslf){
		
		if(Listener.keys.get("right").isLastKey())
			x += speed*tslf;
		if(Listener.keys.get("left").isLastKey())
			x -= speed*tslf;
		if(Listener.keys.get("up").isLastKey())
			y -= speed*tslf;
		if(Listener.keys.get("down").isLastKey())
			y += speed*tslf;
	}
	
	@Override
	protected void paintComponent(Graphics g) {


		try {
			if(Var.spriteSheet == null)Var.spriteSheet = ImageIO.read(new File("res/pacman_sprites_full_32.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Graphics2D g2 = (Graphics2D) g;
		super.paintComponent(g2);
		this.draw(g2);
		update();
	}
	
	
	public void update(){
		long thisFrame = System.currentTimeMillis();
		float tslf = (thisFrame-lastFrame)/1000f;
		lastFrame = thisFrame;
		this.update(tslf);
	}
	
}
