package de.dittich.pacman;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Menubar {
	
	public JMenuBar getMenuebar(){
		JMenuBar bar = new JMenuBar();
		Border bo = new LineBorder(Color.black);
		bar.setBorder(bo);
		JMenu menuDatei = new JMenu("Datei");
		bar.add(menuDatei);
		JMenu menuOptionen = new JMenu("Optionen");
		bar.add(menuOptionen);
		JMenuItem itemStart = new JMenuItem("Game starten");
		menuDatei.add(itemStart);
		JMenuItem itemPaused = new JMenuItem("Game pausieren");
		menuDatei.add(itemPaused);
		JMenuItem itemContinue = new JMenuItem("Game fortfahren");
		menuDatei.add(itemContinue);
		JMenuItem itemEnd = new JMenuItem("Beenden");
		menuDatei.add(itemEnd);
		JMenuItem itemProperties = new JMenuItem("Éinstellungen");
		menuOptionen.add(itemProperties);
		
		itemStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Var.resetAll();
				Var.gameRun = true;
			}
		});
		
		itemPaused.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Var.gameRun = false;
			}
		});
		
		itemContinue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Var.gameRun = true;
			}
		});
		
		itemEnd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		return bar;
	}
}
