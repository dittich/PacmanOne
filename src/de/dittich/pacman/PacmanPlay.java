package de.dittich.pacman;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class PacmanPlay {
	
	private Gui gui;
	
	public void PacmanPlay(){
		
	}
	
	public void pacmanGo() throws IOException{
		Maze.loadMaze();
		gui = new Gui();
		new PacmanMovement();
		new PacmanAnimation();
		new GhostMovement();
		new GhostAnimation();
		
		Timer gamingLoop = new Timer();
		gamingLoop.scheduleAtFixedRate(new TimerTask() {

			@Override
			/*
			 * Gaming-Loop
			 */
			public void run() {
				// TODO Auto-generated method stub
				while(Var.gameRun){
					Var.lbl1.repaint();
				}
				
			}
		}, 0, 10);
	}
}
