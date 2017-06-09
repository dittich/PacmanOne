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
			Var.movenextup = true;
			Var.movenextdown = false;
			Var.movenextleft = false;
			Var.movenextright = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			Var.movenextup = false;
			Var.movenextdown = true;
			Var.movenextleft = false;
			Var.movenextright = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			Var.movenextup = false;
			Var.movenextdown = false;
			Var.movenextleft = true;
			Var.movenextright = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			Var.movenextup = false;
			Var.movenextdown = false;
			Var.movenextleft = false;
			Var.movenextright = true;
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
