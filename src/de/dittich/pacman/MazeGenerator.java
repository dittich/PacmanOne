package de.dittich.pacman;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MazeGenerator {
	
	public static void main(String[] args) throws IOException{
		BufferedImage iMaze = ImageIO.read(new File("res/iMazeTest.png"));
		int height = iMaze.getHeight();
		int width = iMaze.getWidth();
		String line = "";
		
		FileWriter fw = new FileWriter("res/mazeOneTest.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("");
		
		for(int i=0; i<height; i++){
			for(int j=0; j<width; j++){
				int rgb = iMaze.getRGB(j, i);
				int rot = new Color(rgb).getRed();
				//Schwarz = 0; Weiss = 1;
				if(rot==0)line+="0";
				else line+="1";
			}
			bw.append(line);
			line = "";
		}
		
		bw.close();
		fw.close();
	}
}
