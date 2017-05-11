package de.infogk1.pacman;

import java.awt.event.KeyEvent;

public class Game implements Runnable{

	private Board b;
	
	private static boolean gestoppt;
	
	public Game(){
		gestoppt = false;
		
		b = new Board();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!gestoppt){
			b.repaint();
			if(Listener.keyCode == KeyEvent.VK_SPACE){
				gestoppt = true;
				System.exit(0);
			}
		}
	}

}
