package de.dittich.pacman;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Listener implements KeyListener {

	public Listener() {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_W) {
			Var.moveup = true;
			Var.movedown = false;
			Var.moveleft = false;
			Var.moveright = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			Var.moveup = false;
			Var.movedown = true;
			Var.moveleft = false;
			Var.moveright = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			Var.moveup = false;
			Var.movedown = false;
			Var.moveleft = true;
			Var.moveright = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			Var.moveup = false;
			Var.movedown = false;
			Var.moveleft = false;
			Var.moveright = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		/*
		if (e.getKeyCode() == KeyEvent.VK_W) {
			Var.moveup = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			Var.movedown = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			Var.moveleft = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			Var.moveright = false;
		}
		*/
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
