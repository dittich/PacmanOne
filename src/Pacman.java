import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class Pacman {

	float x;
	float y;
	float speed = 1f;
	
	public Pacman(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void draw(Graphics2D g){
		g.drawString("Das ist Pacman", 40, 40);
		g.setColor(Color.YELLOW);
		g.fillOval((int)x, (int)y, 50, 50);
	}
	
	public void update(){
		if(Listener.keyCode == KeyEvent.VK_D)
			x += speed;
		if(Listener.keyCode == KeyEvent.VK_A)
			x -= speed;
		if(Listener.keyCode == KeyEvent.VK_W)
			y -= speed;
		if(Listener.keyCode == KeyEvent.VK_S)
			y += speed;
	}
	
}
