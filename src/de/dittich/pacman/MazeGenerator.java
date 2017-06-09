package de.dittich.pacman;

/*
 * Wand = 0 - schawrz
 * Gang = 1 - weiss
 * Pacman = 2 - blau
 * Ghost = 3 - gruen
 * 
 */

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MazeGenerator {
	
	public static void main(String[] args) throws IOException{
		BufferedImage iMaze = ImageIO.read(new File("res/mazeTwo.png"));
		int height = iMaze.getHeight();
		int width = iMaze.getWidth();
		String line = "";
		
		FileWriter fw = new FileWriter("res/mazeTwo.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("");
		
		for(int i=0; i<height; i++){
			for(int j=0; j<width; j++){
				int rgb = iMaze.getRGB(j, i);
				int rot = new Color(rgb).getRed();
				int gruen = new Color(rgb).getGreen();
				int blau = new Color(rgb).getBlue();
				
				if(rot==0 && gruen==0 && blau==0)line+="0";
				else if(rot==255 && gruen==255 && blau==255)line+="1";
				else if(rot==0 && gruen==0 && blau==255)line+="2";
				else if(rot==0 && gruen==255 && blau==0)line+="3";
				//else ;
			}
			bw.append(line);
			bw.newLine();
			line = "";
		}
		
		bw.close();
		fw.close();
	}
}
