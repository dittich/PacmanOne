package de.dittich.pacman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maze {

	public static void loadMaze() {
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(new File(Var.fileMaze))));
			for (int i = 0; i < 800; i++) {
				String line = br.readLine();
				char[] c = line.toCharArray();
				for (int j = 0; j < 1000; j++) {
					Var.maze[j][i] = Integer.parseInt("" + c[j]);
					if (Integer.parseInt("" + c[j]) == 2) {
						Var.xPac = j;
						Var.yPac = i;
					}
					else if(Integer.parseInt("" + c[j]) == 3) {
						for(int k=0; k<=3; k++){
							Var.xG[k]=j;
							Var.yG[k]=i;
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
