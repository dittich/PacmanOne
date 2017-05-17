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
				if (Var.moveup) {
					Var.y -= Var.speed;
					Var.rotation = 0;
				} else if (Var.movedown) {
					Var.y += Var.speed;
					Var.rotation = 180;
				} else if (Var.moveleft) {
					Var.x -= Var.speed;
					Var.rotation = -90;
				} else if (Var.moveright) {
					Var.x += Var.speed;
					Var.rotation = 90;
				}
			}

		}, 0, 10);
	}
}
