package de.dittich.pacman;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) throws IOException {
		PacmanPlay pp = new PacmanPlay();
		pp.pacmanGo();
	}
}
