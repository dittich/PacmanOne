import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(600, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.add(new Panel());
		f.addKeyListener(new Listener());
		while(true){
			f.repaint();
		}
	}
	
}
