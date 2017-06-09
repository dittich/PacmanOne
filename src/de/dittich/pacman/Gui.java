package de.dittich.pacman;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Gui {

	public Gui() throws IOException {
		Var.mazeImage = ImageIO.read(new File(Var.fileMazeImage));
		
		Var.jf1 = new JFrame();
		Var.jf1.setSize(Var.screenwidth, Var.screenheight);
		Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.jf1.setLocationRelativeTo(null);
		Var.jf1.setLayout(null);
		Var.jf1.setTitle(Var.title);
		Var.jf1.setResizable(false);
		Var.jf1.addKeyListener(new Listener());
		Var.jf1.requestFocus();
		Var.jf1.setVisible(true);

		Var.lbl1 = new Label();
		Var.lbl1.setBounds(0, 0, Var.screenwidth, Var.screenheight);
		Var.lbl1.setVisible(true);
		
		Var.jf1.add(Var.lbl1);
	}
}
