
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yifeng
 */
public class goodFruit {
   Image goodFruit;
   Random rand = new Random();
   int x_goodFruit;
    int y_goodFruit;
    
    
    public goodFruit(){
        goodFruit =new ImageIcon("src/images/banana.jpg").getImage();
    }
    
    public void randomPosition(){
        x_goodFruit = rand.nextInt(800);
        y_goodFruit= 0;
    }
    
    public int getCurrX(){
        return x_goodFruit ;
    }
    public int getCurrY(){
        return y_goodFruit;
    }
    
    public Image getImage(){
        return goodFruit;
    }
    
    public Rectangle getBound()
	{
		return new Rectangle(getCurrX(),getCurrY(),50,50);
	}
    
    public void fallGoodFruit(){
	if(y_goodFruit >=600){ 
		randomPosition();
        }
	else
		y_goodFruit++; 
	}
    
    
    
    
   
}
