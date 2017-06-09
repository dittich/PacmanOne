package de.dittich.pacman;

import java.util.Timer;
import java.util.TimerTask;

public class GhostMovement {

	Timer movement;
	
	public GhostMovement() {
		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				if(Var.gameRun && !Var.collision){
					for(int i=0; i<=3; i++){
						kreuzung(i);
						
						if(Var.dG[i]==0 && Var.yG[i]-1!=0)
							Var.yG[i] -= 1;
						else if(Var.dG[i]==90 && Var.xG[i]-1!=0)
							Var.xG[i] -= 1;
						else if(Var.dG[i]==180 && Var.yG[i]+1!=0)
							Var.yG[i] += 1;
						else if(Var.dG[i]==270 && Var.xG[i]+1!=0)
							Var.xG[i] += 1;
					}
				}
				else{
					//Reset
					
				}
			}
		},0,50-Var.speedG);
	}
	
	public static void kreuzung(int ghostID){
		int xPos = Var.xG[ghostID];
		int yPos = Var.yG[ghostID];
		int lDir = Var.dG[ghostID];
		
		int xlinks = Var.maze[xPos-1][yPos];
		int xrechts = Var.maze[xPos+1][yPos];
		int yoben = Var.maze[xPos][yPos-1];
		int yunten = Var.maze[xPos][yPos+1];
		
		int ways = 0;
		if(Var.maze[xPos][yPos-1] != 0)
			ways++;
		if(Var.maze[xPos-1][yPos] != 0)
			ways++;
		if(Var.maze[xPos][yPos+1] != 0)
			ways++;
		if(Var.maze[xPos+1][yPos] != 0)
			ways++;
		
		//Ways = 1 --> Sackgasse
		if(ways==1){
			if(Var.dG[ghostID]==0 && Var.maze[Var.xG[ghostID]][Var.yG[ghostID]-1]==0)
				Var.dG[ghostID] = 180;
			else if(Var.dG[ghostID]==90 && Var.maze[Var.xG[ghostID]-1][Var.yG[ghostID]]==0)
				Var.dG[ghostID] = 270;
			else if(Var.dG[ghostID]==180 && Var.maze[Var.xG[ghostID]][Var.yG[ghostID]+1]==0)
				Var.dG[ghostID] = 0;
			else if(Var.dG[ghostID]==270 && Var.maze[Var.xG[ghostID]+1][Var.yG[ghostID]]==0)
				Var.dG[ghostID] = 90;
		}
		
		//Ways = 2 --> Weiter gehen, evtl um die Ecke
		else if(ways==2){
			Var.dG[ghostID]=twoWayDirection(ghostID);
		}
		else if(ways>=3){
			Var.dG[ghostID]=moreWayDirection(ghostID, ways);
		}
	}
	
	public static int moreWayDirection(int i, int ways){
		int lDir = Var.dG[i];
		int xPos = Var.xG[i];
		int yPos = Var.yG[i];
		int counter = 0;
		int newWalk = (int)Math.round(Math.random()*ways);
		
		if(Var.maze[xPos][yPos-1] != 0){
			counter++;
			if(counter==newWalk)return 0;
		}
		if(Var.maze[xPos-1][yPos] != 0){
			counter++;
			if(counter==newWalk)return 90;
		}
		if(Var.maze[xPos][yPos+1] != 0){
			counter++;
			if(counter==newWalk)return 180;
		}
		if(Var.maze[xPos+1][yPos] != 0){
			counter++;
			if(counter==newWalk)return 270;
		}
		
		return lDir;
	}
	
	public static int twoWayDirection(int i){
		int lDir = Var.dG[i];
		int xPos = Var.xG[i];
		int yPos = Var.yG[i];
		
		//Ist die Bewegungsrichtung frei, dann lauf weiter
		if ((Var.maze[xPos][yPos - 1] != 0 && lDir == 0) || (Var.maze[xPos - 1][yPos] != 0 && lDir == 90)
				|| (Var.maze[xPos][yPos + 1] != 0 && lDir == 180) || (Var.maze[xPos + 1][yPos] != 0 && lDir == 270))
			return lDir;
		else{
			if(Var.maze[xPos][yPos-1] != 0 && lDir!=180)
				return 0;
			else if(Var.maze[xPos-1][yPos] != 0 && lDir!=270)
				return 90;
			else if(Var.maze[xPos][yPos+1] != 0 && lDir!=0)
				return 180;
			//if(Var.maze[xPos+1][yPos] != 0 && lDir!=90)
			else
				return 270;
		}		
	}
}
