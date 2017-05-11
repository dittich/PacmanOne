package de.infogk1.pacman;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		new Thread(new Game()).start();
	}
	
}
