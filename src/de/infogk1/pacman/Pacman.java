package de.infogk1.pacman;

import java.awt.Color;
import java.awt.Graphics2D;

public class Pacman {

	float x;
	float y;
	int speed = 500;
	
	public Pacman(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void draw(Graphics2D g){
		g.drawString("Das ist Pacman", 40, 40);
		g.setColor(Color.YELLOW);
		g.fillOval((int)x, (int)y, 50, 50);
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
	
}
