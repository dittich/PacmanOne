import javax.swing.JFrame;

public class Board extends JFrame{
	
	public Board(){
		super();
		this.setSize(600, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.add(new Panel());
		this.addKeyListener(new Listener());
	}
}
