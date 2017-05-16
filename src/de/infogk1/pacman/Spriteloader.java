package de.infogk1.pacman;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Spriteloader
{
	static BufferedImage spriteSheet = Var.spriteSheet;   
   
   				//by Filipus and Luke sponsored by SevenUp(loader)
   public Spriteloader() throws IOException
   {
	   
   }
   
   public static BufferedImage[] getSprites(int width, int height, int rows, int columns, int offsetX, int offsetY){
	   BufferedImage[] sprites = new BufferedImage[rows * columns];
	   for(int i = offsetX; i < rows+offsetX; i++)
	   {
	         for(int j = offsetY; j < columns+offsetY; j++)
	         {
	            sprites[(i * columns) + j] = spriteSheet.getSubimage(i * width, j * height, width, height);
	         }
	   }
	   return sprites;
   }
}