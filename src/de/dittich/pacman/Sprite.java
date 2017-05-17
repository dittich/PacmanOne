package de.dittich.pacman;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {
    
    public static BufferedImage loadSprite(){

        BufferedImage sprite = null;
		try {
			sprite = ImageIO.read(new File(Var.filePacman));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        return sprite;
    }
	
    public static BufferedImage getSprite(int xGrid, int yGrid){

		if (Var.spriteSheet == null) {
        	Var.spriteSheet = loadSprite();
        }

        return Var.spriteSheet.getSubimage(xGrid * Var.TILE_SIZE, yGrid * Var.TILE_SIZE, Var.TILE_SIZE, Var.TILE_SIZE);
    }

}