import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Listener implements KeyListener{

	public static int keyCode = 0;
	
	@Override
	public void keyPressed(KeyEvent e) {
		keyCode = e.getKeyCode();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keyCode = 0;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
