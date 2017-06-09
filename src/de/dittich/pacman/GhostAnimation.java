package de.dittich.pacman;

import java.util.Timer;
import java.util.TimerTask;

public class GhostAnimation {
	
	Timer walkG;
	private int temp = 0;

	public GhostAnimation() {
		walkG = new Timer();
		walkG.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				temp++;
				if (temp == Var.ghost.length)
					temp = 0;
				Var.ghostOneAnimationsFrame = temp;
			}

		}, 0, 100);
	}
}
