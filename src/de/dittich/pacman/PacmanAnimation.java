package de.dittich.pacman;

import java.util.Timer;
import java.util.TimerTask;

public class PacmanAnimation {

	Timer walk;
	private int temp = 0;

	public PacmanAnimation() {
		walk = new Timer();
		walk.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				temp++;
				if (temp == Var.iPacman.length)
					temp = 0;
				Var.pacmanAnimationsFrame = temp;
			}

		}, 0, 100);
	}
}
