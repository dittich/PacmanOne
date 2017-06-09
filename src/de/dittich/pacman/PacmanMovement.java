package de.dittich.pacman;

import java.util.Timer;
import java.util.TimerTask;

public class PacmanMovement {

	Timer movement;

	public PacmanMovement() {
		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if (Var.movenextup && Var.maze[Var.xPac][Var.yPac-Var.step]!=0) {
					Var.moveUp();
				} else if (Var.movenextdown && Var.maze[Var.xPac][Var.yPac+Var.step]!=0) {
					Var.moveDown();
				} else if (Var.movenextleft && Var.maze[Var.xPac-Var.step][Var.yPac]!=0) {
					Var.moveLeft();
				} else if (Var.movenextright && Var.maze[Var.xPac+Var.step][Var.yPac]!=0) {
					Var.moveRight();
				}
				
				if (Var.moveup && Var.maze[Var.xPac][Var.yPac-Var.step]!=0) {
					Var.yPac -= Var.step;
					Var.rotation = 0;
				} else if (Var.movedown && Var.maze[Var.xPac][Var.yPac+Var.step]!=0) {
					Var.yPac += Var.step;
					Var.rotation = 180;
				} else if (Var.moveleft && Var.maze[Var.xPac-Var.step][Var.yPac]!=0) {
					Var.xPac -= Var.step;
					Var.rotation = -90;
				} else if (Var.moveright && Var.maze[Var.xPac+Var.step][Var.yPac]!=0) {
					Var.xPac += Var.step;
					Var.rotation = 90;
				}
			}

		}, 0, 10-Var.speedPac);
	}
}
