package de.dittich.pacman;

import java.util.Timer;
import java.util.TimerTask;

public class Collision {
	
	Timer collision;
	
	public Collision(){
		collision = new Timer();
		collision.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if(Var.gameRun && !Var.collision){
					int xP = Var.xPac;
					int yP = Var.yPac;
					
					for(int i=0; i<=3; i++){
						int xG = Var.xG[i];
						int yG = Var.yG[i];
						
						if(Math.abs(xP-xG)<=2 && Math.abs(yP-yG)<=2){
							Var.collision=true;
						}
					}
				}
			}
			
		},0,10);
	}
	
}
