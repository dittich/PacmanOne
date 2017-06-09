package de.dittich.pacman;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) throws IOException {
		Main game = new Main();
		game.pacmanGo();
	}
	
	public void pacmanGo() throws IOException{
		Maze.loadMaze();
		new Gui();
		new PacmanMovement();
		new PacmanAnimation();
		new GhostMovement(1);
		new GhostAnimation();
		
		Timer gamingLoop = new Timer();
		gamingLoop.scheduleAtFixedRate(new TimerTask() {

			@Override
			/*
			 * Gaming-Loop
			 */
			public void run() {
				// TODO Auto-generated method stub
				Var.lbl1.repaint();
			}
		}, 0, 10);
	}
}
