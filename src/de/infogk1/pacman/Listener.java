package de.infogk1.pacman;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Stack;

public class Listener implements KeyListener{

	public static int keyCode = 0;
	public static HashMap<String, KeyTrigger> keys = new HashMap<>();
	public static Stack<KeyTrigger> lastKey = new Stack<KeyTrigger>();
	
	public Listener(){
		keys.put("up", new KeyTrigger(KeyEvent.VK_W, KeyEvent.VK_UP));
		keys.put("down", new KeyTrigger(KeyEvent.VK_S, KeyEvent.VK_DOWN));
		keys.put("left", new KeyTrigger(KeyEvent.VK_A, KeyEvent.VK_LEFT));
		keys.put("right", new KeyTrigger(KeyEvent.VK_D, KeyEvent.VK_RIGHT));
		keys.put("space", new KeyTrigger(KeyEvent.VK_SPACE));
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		keyCode = e.getKeyCode();
		keys.get("up").checkTrigger(e.getKeyCode(), true);
		keys.get("down").checkTrigger(e.getKeyCode(), true);
		keys.get("left").checkTrigger(e.getKeyCode(), true);
		keys.get("right").checkTrigger(e.getKeyCode(), true);
		keys.get("space").checkTrigger(e.getKeyCode(), true);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keyCode = 0;
		keys.get("up").checkTrigger(e.getKeyCode(), false);
		keys.get("down").checkTrigger(e.getKeyCode(), false);
		keys.get("left").checkTrigger(e.getKeyCode(), false);
		keys.get("right").checkTrigger(e.getKeyCode(), false);
		keys.get("space").checkTrigger(e.getKeyCode(), false);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
